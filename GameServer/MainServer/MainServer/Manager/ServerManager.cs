﻿using System;
using System.Collections.Generic;
using RedStone.Net;

namespace RedStone
{
    public class ServerManager : Core.Singleton<ServerManager>
    {
        private Dictionary<NetType, Net.Network> m_networks = new Dictionary<NetType, Net.Network>();

        public Net.Network Get(NetType type)
        {
            return m_networks[type];
        }

        public void Init()
        {
            m_networks.Add(NetType.Hall, new Net.Network(new WebSocketConnection(), NetType.Hall));
            m_networks.Add(NetType.Battle, new Net.Network(new WebSocketConnection(), NetType.Battle));
        }

        public void Update()
        {
            var itr = m_networks.GetEnumerator();
            while (itr.MoveNext())
            {
                itr.Current.Value.Update();
            }
        }

        public void Connect(NetType type, string addr)
        {
            m_networks[type].Init(addr);
            m_networks[type].Listen();
        }

        public void CloseAll()
        {
            var itr = m_networks.GetEnumerator();
            while (itr.MoveNext())
            {
                itr.Current.Value.Close();
            }
        }

        public void Close(NetType type)
        {
            m_networks[type].Close();
        }

        public void SendMessage<T>(NetType type, T message)
        {
            m_networks[type].SendMessage(message);
        }

        public void SendMessage<T1, T2>(NetType type, T1 message, Action<T2> callback)
        {
            m_networks[type].SendMessage(message, callback);
        }

        public void Register<T>(NetType type, Action<T> callback)
        {
            m_networks[type].Register(callback);
        }

        public void UnRegister<T>(NetType type, Action<T> callback)
        {
            m_networks[type].UnRegister(callback);
        }
    }
}
