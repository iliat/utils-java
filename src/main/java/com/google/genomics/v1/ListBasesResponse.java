// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/references.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.ListBasesResponse}
 */
public  final class ListBasesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.ListBasesResponse)
    ListBasesResponseOrBuilder {
  // Use ListBasesResponse.newBuilder() to construct.
  private ListBasesResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ListBasesResponse() {
    offset_ = 0L;
    sequence_ = "";
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListBasesResponse(
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
          case 8: {

            offset_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            sequence_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();

            nextPageToken_ = bs;
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
    return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_ListBasesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_ListBasesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.ListBasesResponse.class, com.google.genomics.v1.ListBasesResponse.Builder.class);
  }

  public static final int OFFSET_FIELD_NUMBER = 1;
  private long offset_;
  /**
   * <code>optional int64 offset = 1;</code>
   *
   * <pre>
   * The offset position (0-based) of the given `sequence` from the
   * start of this `Reference`. This value will differ for each page
   * in a paginated request.
   * </pre>
   */
  public long getOffset() {
    return offset_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object sequence_;
  /**
   * <code>optional string sequence = 2;</code>
   *
   * <pre>
   * A substring of the bases that make up this reference.
   * </pre>
   */
  public java.lang.String getSequence() {
    java.lang.Object ref = sequence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        sequence_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string sequence = 2;</code>
   *
   * <pre>
   * A substring of the bases that make up this reference.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getSequenceBytes() {
    java.lang.Object ref = sequence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sequence_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        nextPageToken_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    if (offset_ != 0L) {
      output.writeInt64(1, offset_);
    }
    if (!getSequenceBytes().isEmpty()) {
      output.writeBytes(2, getSequenceBytes());
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      output.writeBytes(3, getNextPageTokenBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, offset_);
    }
    if (!getSequenceBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getSequenceBytes());
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getNextPageTokenBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.ListBasesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ListBasesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.ListBasesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ListBasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.ListBasesResponse prototype) {
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
   * Protobuf type {@code google.genomics.v1.ListBasesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.ListBasesResponse)
      com.google.genomics.v1.ListBasesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_ListBasesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_ListBasesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.ListBasesResponse.class, com.google.genomics.v1.ListBasesResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.ListBasesResponse.newBuilder()
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
      offset_ = 0L;

      sequence_ = "";

      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_ListBasesResponse_descriptor;
    }

    public com.google.genomics.v1.ListBasesResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.ListBasesResponse.getDefaultInstance();
    }

    public com.google.genomics.v1.ListBasesResponse build() {
      com.google.genomics.v1.ListBasesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.ListBasesResponse buildPartial() {
      com.google.genomics.v1.ListBasesResponse result = new com.google.genomics.v1.ListBasesResponse(this);
      result.offset_ = offset_;
      result.sequence_ = sequence_;
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.ListBasesResponse) {
        return mergeFrom((com.google.genomics.v1.ListBasesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.ListBasesResponse other) {
      if (other == com.google.genomics.v1.ListBasesResponse.getDefaultInstance()) return this;
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (!other.getSequence().isEmpty()) {
        sequence_ = other.sequence_;
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.genomics.v1.ListBasesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.ListBasesResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long offset_ ;
    /**
     * <code>optional int64 offset = 1;</code>
     *
     * <pre>
     * The offset position (0-based) of the given `sequence` from the
     * start of this `Reference`. This value will differ for each page
     * in a paginated request.
     * </pre>
     */
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>optional int64 offset = 1;</code>
     *
     * <pre>
     * The offset position (0-based) of the given `sequence` from the
     * start of this `Reference`. This value will differ for each page
     * in a paginated request.
     * </pre>
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 offset = 1;</code>
     *
     * <pre>
     * The offset position (0-based) of the given `sequence` from the
     * start of this `Reference`. This value will differ for each page
     * in a paginated request.
     * </pre>
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object sequence_ = "";
    /**
     * <code>optional string sequence = 2;</code>
     *
     * <pre>
     * A substring of the bases that make up this reference.
     * </pre>
     */
    public java.lang.String getSequence() {
      java.lang.Object ref = sequence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sequence_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sequence = 2;</code>
     *
     * <pre>
     * A substring of the bases that make up this reference.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSequenceBytes() {
      java.lang.Object ref = sequence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sequence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sequence = 2;</code>
     *
     * <pre>
     * A substring of the bases that make up this reference.
     * </pre>
     */
    public Builder setSequence(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sequence = 2;</code>
     *
     * <pre>
     * A substring of the bases that make up this reference.
     * </pre>
     */
    public Builder clearSequence() {
      
      sequence_ = getDefaultInstance().getSequence();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sequence = 2;</code>
     *
     * <pre>
     * A substring of the bases that make up this reference.
     * </pre>
     */
    public Builder setSequenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sequence_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nextPageToken_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.ListBasesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.ListBasesResponse)
  private static final com.google.genomics.v1.ListBasesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.ListBasesResponse();
  }

  public static com.google.genomics.v1.ListBasesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ListBasesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListBasesResponse>() {
    public ListBasesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ListBasesResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ListBasesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBasesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.ListBasesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

