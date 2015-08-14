// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.GetReadGroupSetRequest}
 */
public  final class GetReadGroupSetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.GetReadGroupSetRequest)
    GetReadGroupSetRequestOrBuilder {
  // Use GetReadGroupSetRequest.newBuilder() to construct.
  private GetReadGroupSetRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private GetReadGroupSetRequest() {
    readGroupSetId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetReadGroupSetRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            readGroupSetId_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_GetReadGroupSetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_GetReadGroupSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.GetReadGroupSetRequest.class, com.google.genomics.v1.GetReadGroupSetRequest.Builder.class);
  }

  public static final int READ_GROUP_SET_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object readGroupSetId_;
  /**
   * <code>optional string read_group_set_id = 1;</code>
   *
   * <pre>
   * The ID of the read group set.
   * </pre>
   */
  public java.lang.String getReadGroupSetId() {
    java.lang.Object ref = readGroupSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        readGroupSetId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string read_group_set_id = 1;</code>
   *
   * <pre>
   * The ID of the read group set.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getReadGroupSetIdBytes() {
    java.lang.Object ref = readGroupSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      readGroupSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getReadGroupSetIdBytes().isEmpty()) {
      output.writeBytes(1, getReadGroupSetIdBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReadGroupSetIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getReadGroupSetIdBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.GetReadGroupSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.GetReadGroupSetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.GetReadGroupSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.GetReadGroupSetRequest)
      com.google.genomics.v1.GetReadGroupSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_GetReadGroupSetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_GetReadGroupSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.GetReadGroupSetRequest.class, com.google.genomics.v1.GetReadGroupSetRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.GetReadGroupSetRequest.newBuilder()
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
      readGroupSetId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_GetReadGroupSetRequest_descriptor;
    }

    public com.google.genomics.v1.GetReadGroupSetRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.GetReadGroupSetRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.GetReadGroupSetRequest build() {
      com.google.genomics.v1.GetReadGroupSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.GetReadGroupSetRequest buildPartial() {
      com.google.genomics.v1.GetReadGroupSetRequest result = new com.google.genomics.v1.GetReadGroupSetRequest(this);
      result.readGroupSetId_ = readGroupSetId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.GetReadGroupSetRequest) {
        return mergeFrom((com.google.genomics.v1.GetReadGroupSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.GetReadGroupSetRequest other) {
      if (other == com.google.genomics.v1.GetReadGroupSetRequest.getDefaultInstance()) return this;
      if (!other.getReadGroupSetId().isEmpty()) {
        readGroupSetId_ = other.readGroupSetId_;
        onChanged();
      }
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
      com.google.genomics.v1.GetReadGroupSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.GetReadGroupSetRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object readGroupSetId_ = "";
    /**
     * <code>optional string read_group_set_id = 1;</code>
     *
     * <pre>
     * The ID of the read group set.
     * </pre>
     */
    public java.lang.String getReadGroupSetId() {
      java.lang.Object ref = readGroupSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          readGroupSetId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string read_group_set_id = 1;</code>
     *
     * <pre>
     * The ID of the read group set.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReadGroupSetIdBytes() {
      java.lang.Object ref = readGroupSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        readGroupSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string read_group_set_id = 1;</code>
     *
     * <pre>
     * The ID of the read group set.
     * </pre>
     */
    public Builder setReadGroupSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      readGroupSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string read_group_set_id = 1;</code>
     *
     * <pre>
     * The ID of the read group set.
     * </pre>
     */
    public Builder clearReadGroupSetId() {
      
      readGroupSetId_ = getDefaultInstance().getReadGroupSetId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string read_group_set_id = 1;</code>
     *
     * <pre>
     * The ID of the read group set.
     * </pre>
     */
    public Builder setReadGroupSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      readGroupSetId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.GetReadGroupSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.GetReadGroupSetRequest)
  private static final com.google.genomics.v1.GetReadGroupSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.GetReadGroupSetRequest();
  }

  public static com.google.genomics.v1.GetReadGroupSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<GetReadGroupSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetReadGroupSetRequest>() {
    public GetReadGroupSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetReadGroupSetRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<GetReadGroupSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetReadGroupSetRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.GetReadGroupSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

