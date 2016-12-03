// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NewTurnBroadcast.proto

package org.redstone.protobuf.msg;

/**
 * Protobuf type {@code org.redstone.protobuf.msg.NewTurnBroadcast}
 */
public  final class NewTurnBroadcast extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.redstone.protobuf.msg.NewTurnBroadcast)
    NewTurnBroadcastOrBuilder {
  // Use NewTurnBroadcast.newBuilder() to construct.
  private NewTurnBroadcast(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private NewTurnBroadcast() {
    camp_ = 1;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NewTurnBroadcast(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            org.redstone.protobuf.msg.Enums.Camp value = org.redstone.protobuf.msg.Enums.Camp.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              camp_ = rawValue;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_NewTurnBroadcast_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_NewTurnBroadcast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.redstone.protobuf.msg.NewTurnBroadcast.class, org.redstone.protobuf.msg.NewTurnBroadcast.Builder.class);
  }

  public static final com.google.protobuf.Parser<NewTurnBroadcast> PARSER =
      new com.google.protobuf.AbstractParser<NewTurnBroadcast>() {
    public NewTurnBroadcast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NewTurnBroadcast(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<NewTurnBroadcast> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int CAMP_FIELD_NUMBER = 1;
  private int camp_;
  /**
   * <code>optional .org.redstone.protobuf.msg.Enums.Camp camp = 1 [default = NoneCamp];</code>
   */
  public boolean hasCamp() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .org.redstone.protobuf.msg.Enums.Camp camp = 1 [default = NoneCamp];</code>
   */
  public org.redstone.protobuf.msg.Enums.Camp getCamp() {
    org.redstone.protobuf.msg.Enums.Camp result = org.redstone.protobuf.msg.Enums.Camp.valueOf(camp_);
    return result == null ? org.redstone.protobuf.msg.Enums.Camp.NoneCamp : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, camp_);
    }
    unknownFields.writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, camp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.redstone.protobuf.msg.NewTurnBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.redstone.protobuf.msg.NewTurnBroadcast prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.redstone.protobuf.msg.NewTurnBroadcast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.redstone.protobuf.msg.NewTurnBroadcast)
      org.redstone.protobuf.msg.NewTurnBroadcastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_NewTurnBroadcast_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_NewTurnBroadcast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.redstone.protobuf.msg.NewTurnBroadcast.class, org.redstone.protobuf.msg.NewTurnBroadcast.Builder.class);
    }

    // Construct using org.redstone.protobuf.msg.NewTurnBroadcast.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      camp_ = 1;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_NewTurnBroadcast_descriptor;
    }

    public org.redstone.protobuf.msg.NewTurnBroadcast getDefaultInstanceForType() {
      return org.redstone.protobuf.msg.NewTurnBroadcast.getDefaultInstance();
    }

    public org.redstone.protobuf.msg.NewTurnBroadcast build() {
      org.redstone.protobuf.msg.NewTurnBroadcast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.redstone.protobuf.msg.NewTurnBroadcast buildPartial() {
      org.redstone.protobuf.msg.NewTurnBroadcast result = new org.redstone.protobuf.msg.NewTurnBroadcast(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.camp_ = camp_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.redstone.protobuf.msg.NewTurnBroadcast) {
        return mergeFrom((org.redstone.protobuf.msg.NewTurnBroadcast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.redstone.protobuf.msg.NewTurnBroadcast other) {
      if (other == org.redstone.protobuf.msg.NewTurnBroadcast.getDefaultInstance()) return this;
      if (other.hasCamp()) {
        setCamp(other.getCamp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.redstone.protobuf.msg.NewTurnBroadcast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.redstone.protobuf.msg.NewTurnBroadcast) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int camp_ = 1;
    /**
     * <code>optional .org.redstone.protobuf.msg.Enums.Camp camp = 1 [default = NoneCamp];</code>
     */
    public boolean hasCamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .org.redstone.protobuf.msg.Enums.Camp camp = 1 [default = NoneCamp];</code>
     */
    public org.redstone.protobuf.msg.Enums.Camp getCamp() {
      org.redstone.protobuf.msg.Enums.Camp result = org.redstone.protobuf.msg.Enums.Camp.valueOf(camp_);
      return result == null ? org.redstone.protobuf.msg.Enums.Camp.NoneCamp : result;
    }
    /**
     * <code>optional .org.redstone.protobuf.msg.Enums.Camp camp = 1 [default = NoneCamp];</code>
     */
    public Builder setCamp(org.redstone.protobuf.msg.Enums.Camp value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      camp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .org.redstone.protobuf.msg.Enums.Camp camp = 1 [default = NoneCamp];</code>
     */
    public Builder clearCamp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      camp_ = 1;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.redstone.protobuf.msg.NewTurnBroadcast)
  }

  // @@protoc_insertion_point(class_scope:org.redstone.protobuf.msg.NewTurnBroadcast)
  private static final org.redstone.protobuf.msg.NewTurnBroadcast defaultInstance;static {
    defaultInstance = new org.redstone.protobuf.msg.NewTurnBroadcast();
  }

  public static org.redstone.protobuf.msg.NewTurnBroadcast getDefaultInstance() {
    return defaultInstance;
  }

  public org.redstone.protobuf.msg.NewTurnBroadcast getDefaultInstanceForType() {
    return defaultInstance;
  }

}

