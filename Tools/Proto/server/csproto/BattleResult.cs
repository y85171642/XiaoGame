//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from: BattleResult.proto
// Note: requires additional types generated from: Enums.proto
namespace org.redstone.protobuf.msg
{
  [global::System.Serializable, global::ProtoBuf.ProtoContract(Name=@"BattleResult")]
  public partial class BattleResult : global::ProtoBuf.IExtensible
  {
    public BattleResult() {}
    
    private org.redstone.protobuf.msg.Enums.Camp _camp = org.redstone.protobuf.msg.Enums.Camp.NoneCamp;
    [global::ProtoBuf.ProtoMember(1, IsRequired = false, Name=@"camp", DataFormat = global::ProtoBuf.DataFormat.TwosComplement)]
    [global::System.ComponentModel.DefaultValue(org.redstone.protobuf.msg.Enums.Camp.NoneCamp)]
    public org.redstone.protobuf.msg.Enums.Camp camp
    {
      get { return _camp; }
      set { _camp = value; }
    }
    private global::ProtoBuf.IExtension extensionObject;
    global::ProtoBuf.IExtension global::ProtoBuf.IExtensible.GetExtensionObject(bool createIfMissing)
      { return global::ProtoBuf.Extensible.GetExtensionObject(ref extensionObject, createIfMissing); }
  }
  
}