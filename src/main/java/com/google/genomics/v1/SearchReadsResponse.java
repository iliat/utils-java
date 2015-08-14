// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.SearchReadsResponse}
 *
 * <pre>
 * The read search response.
 * </pre>
 */
public  final class SearchReadsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.SearchReadsResponse)
    SearchReadsResponseOrBuilder {
  // Use SearchReadsResponse.newBuilder() to construct.
  private SearchReadsResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private SearchReadsResponse() {
    alignments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SearchReadsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              alignments_ = new java.util.ArrayList<com.google.genomics.v1.Read>();
              mutable_bitField0_ |= 0x00000001;
            }
            alignments_.add(input.readMessage(com.google.genomics.v1.Read.PARSER, extensionRegistry));
            break;
          }
          case 18: {
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        alignments_ = java.util.Collections.unmodifiableList(alignments_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.SearchReadsResponse.class, com.google.genomics.v1.SearchReadsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ALIGNMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.genomics.v1.Read> alignments_;
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  public java.util.List<com.google.genomics.v1.Read> getAlignmentsList() {
    return alignments_;
  }
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  public java.util.List<? extends com.google.genomics.v1.ReadOrBuilder> 
      getAlignmentsOrBuilderList() {
    return alignments_;
  }
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  public int getAlignmentsCount() {
    return alignments_.size();
  }
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  public com.google.genomics.v1.Read getAlignments(int index) {
    return alignments_.get(index);
  }
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  public com.google.genomics.v1.ReadOrBuilder getAlignmentsOrBuilder(
      int index) {
    return alignments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 2;</code>
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
   * <code>optional string next_page_token = 2;</code>
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
    for (int i = 0; i < alignments_.size(); i++) {
      output.writeMessage(1, alignments_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      output.writeBytes(2, getNextPageTokenBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < alignments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, alignments_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNextPageTokenBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.SearchReadsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.SearchReadsResponse prototype) {
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
   * Protobuf type {@code google.genomics.v1.SearchReadsResponse}
   *
   * <pre>
   * The read search response.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.SearchReadsResponse)
      com.google.genomics.v1.SearchReadsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.SearchReadsResponse.class, com.google.genomics.v1.SearchReadsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.SearchReadsResponse.newBuilder()
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
        getAlignmentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (alignmentsBuilder_ == null) {
        alignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        alignmentsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_SearchReadsResponse_descriptor;
    }

    public com.google.genomics.v1.SearchReadsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.SearchReadsResponse.getDefaultInstance();
    }

    public com.google.genomics.v1.SearchReadsResponse build() {
      com.google.genomics.v1.SearchReadsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.SearchReadsResponse buildPartial() {
      com.google.genomics.v1.SearchReadsResponse result = new com.google.genomics.v1.SearchReadsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (alignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          alignments_ = java.util.Collections.unmodifiableList(alignments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.alignments_ = alignments_;
      } else {
        result.alignments_ = alignmentsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.SearchReadsResponse) {
        return mergeFrom((com.google.genomics.v1.SearchReadsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.SearchReadsResponse other) {
      if (other == com.google.genomics.v1.SearchReadsResponse.getDefaultInstance()) return this;
      if (alignmentsBuilder_ == null) {
        if (!other.alignments_.isEmpty()) {
          if (alignments_.isEmpty()) {
            alignments_ = other.alignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlignmentsIsMutable();
            alignments_.addAll(other.alignments_);
          }
          onChanged();
        }
      } else {
        if (!other.alignments_.isEmpty()) {
          if (alignmentsBuilder_.isEmpty()) {
            alignmentsBuilder_.dispose();
            alignmentsBuilder_ = null;
            alignments_ = other.alignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            alignmentsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getAlignmentsFieldBuilder() : null;
          } else {
            alignmentsBuilder_.addAllMessages(other.alignments_);
          }
        }
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
      com.google.genomics.v1.SearchReadsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.SearchReadsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.genomics.v1.Read> alignments_ =
      java.util.Collections.emptyList();
    private void ensureAlignmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        alignments_ = new java.util.ArrayList<com.google.genomics.v1.Read>(alignments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.Read, com.google.genomics.v1.Read.Builder, com.google.genomics.v1.ReadOrBuilder> alignmentsBuilder_;

    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.Read> getAlignmentsList() {
      if (alignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alignments_);
      } else {
        return alignmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public int getAlignmentsCount() {
      if (alignmentsBuilder_ == null) {
        return alignments_.size();
      } else {
        return alignmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public com.google.genomics.v1.Read getAlignments(int index) {
      if (alignmentsBuilder_ == null) {
        return alignments_.get(index);
      } else {
        return alignmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder setAlignments(
        int index, com.google.genomics.v1.Read value) {
      if (alignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlignmentsIsMutable();
        alignments_.set(index, value);
        onChanged();
      } else {
        alignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder setAlignments(
        int index, com.google.genomics.v1.Read.Builder builderForValue) {
      if (alignmentsBuilder_ == null) {
        ensureAlignmentsIsMutable();
        alignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        alignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder addAlignments(com.google.genomics.v1.Read value) {
      if (alignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlignmentsIsMutable();
        alignments_.add(value);
        onChanged();
      } else {
        alignmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder addAlignments(
        int index, com.google.genomics.v1.Read value) {
      if (alignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlignmentsIsMutable();
        alignments_.add(index, value);
        onChanged();
      } else {
        alignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder addAlignments(
        com.google.genomics.v1.Read.Builder builderForValue) {
      if (alignmentsBuilder_ == null) {
        ensureAlignmentsIsMutable();
        alignments_.add(builderForValue.build());
        onChanged();
      } else {
        alignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder addAlignments(
        int index, com.google.genomics.v1.Read.Builder builderForValue) {
      if (alignmentsBuilder_ == null) {
        ensureAlignmentsIsMutable();
        alignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        alignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder addAllAlignments(
        java.lang.Iterable<? extends com.google.genomics.v1.Read> values) {
      if (alignmentsBuilder_ == null) {
        ensureAlignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alignments_);
        onChanged();
      } else {
        alignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder clearAlignments() {
      if (alignmentsBuilder_ == null) {
        alignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        alignmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public Builder removeAlignments(int index) {
      if (alignmentsBuilder_ == null) {
        ensureAlignmentsIsMutable();
        alignments_.remove(index);
        onChanged();
      } else {
        alignmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public com.google.genomics.v1.Read.Builder getAlignmentsBuilder(
        int index) {
      return getAlignmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public com.google.genomics.v1.ReadOrBuilder getAlignmentsOrBuilder(
        int index) {
      if (alignmentsBuilder_ == null) {
        return alignments_.get(index);  } else {
        return alignmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public java.util.List<? extends com.google.genomics.v1.ReadOrBuilder> 
         getAlignmentsOrBuilderList() {
      if (alignmentsBuilder_ != null) {
        return alignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alignments_);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public com.google.genomics.v1.Read.Builder addAlignmentsBuilder() {
      return getAlignmentsFieldBuilder().addBuilder(
          com.google.genomics.v1.Read.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public com.google.genomics.v1.Read.Builder addAlignmentsBuilder(
        int index) {
      return getAlignmentsFieldBuilder().addBuilder(
          index, com.google.genomics.v1.Read.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
     *
     * <pre>
     * The list of matching alignments sorted by mapped genomic coordinate,
     * if any, ascending in position within the same reference. Unmapped reads,
     * which have no position, are returned last and are further sorted
     * in ascending lexicographic order by fragment name.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.Read.Builder> 
         getAlignmentsBuilderList() {
      return getAlignmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.Read, com.google.genomics.v1.Read.Builder, com.google.genomics.v1.ReadOrBuilder> 
        getAlignmentsFieldBuilder() {
      if (alignmentsBuilder_ == null) {
        alignmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.genomics.v1.Read, com.google.genomics.v1.Read.Builder, com.google.genomics.v1.ReadOrBuilder>(
                alignments_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        alignments_ = null;
      }
      return alignmentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.SearchReadsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.SearchReadsResponse)
  private static final com.google.genomics.v1.SearchReadsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.SearchReadsResponse();
  }

  public static com.google.genomics.v1.SearchReadsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<SearchReadsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchReadsResponse>() {
    public SearchReadsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new SearchReadsResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<SearchReadsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchReadsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.SearchReadsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

