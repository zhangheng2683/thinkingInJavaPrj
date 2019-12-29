// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login_response.proto

package com.zh.model;

/**
 * Protobuf type {@code LoginResponseDTO}
 */
public  final class LoginResponseDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LoginResponseDTO)
        LoginResponseDTOOrBuilder {
  // Use LoginResponseDTO.newBuilder() to construct.
  private LoginResponseDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginResponseDTO() {
    friends_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LoginResponseDTO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
            UserDTO.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(UserDTO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              friends_ = new java.util.ArrayList<UserDTO>();
              mutable_bitField0_ |= 0x00000002;
            }
            friends_.add(
                input.readMessage(UserDTO.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        friends_ = java.util.Collections.unmodifiableList(friends_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return LoginResponseDTOModel.internal_static_LoginResponseDTO_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LoginResponseDTOModel.internal_static_LoginResponseDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LoginResponseDTO.class, LoginResponseDTO.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private UserDTO user_;
  /**
   * <code>optional .UserDTO user = 1;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>optional .UserDTO user = 1;</code>
   */
  public UserDTO getUser() {
    return user_ == null ? UserDTO.getDefaultInstance() : user_;
  }
  /**
   * <code>optional .UserDTO user = 1;</code>
   */
  public UserDTOOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int FRIENDS_FIELD_NUMBER = 2;
  private java.util.List<UserDTO> friends_;
  /**
   * <code>repeated .UserDTO friends = 2;</code>
   */
  public java.util.List<UserDTO> getFriendsList() {
    return friends_;
  }
  /**
   * <code>repeated .UserDTO friends = 2;</code>
   */
  public java.util.List<? extends UserDTOOrBuilder>
      getFriendsOrBuilderList() {
    return friends_;
  }
  /**
   * <code>repeated .UserDTO friends = 2;</code>
   */
  public int getFriendsCount() {
    return friends_.size();
  }
  /**
   * <code>repeated .UserDTO friends = 2;</code>
   */
  public UserDTO getFriends(int index) {
    return friends_.get(index);
  }
  /**
   * <code>repeated .UserDTO friends = 2;</code>
   */
  public UserDTOOrBuilder getFriendsOrBuilder(
      int index) {
    return friends_.get(index);
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    for (int i = 0; i < friends_.size(); i++) {
      output.writeMessage(2, friends_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    for (int i = 0; i < friends_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, friends_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof LoginResponseDTO)) {
      return super.equals(obj);
    }
    LoginResponseDTO other = (LoginResponseDTO) obj;

    boolean result = true;
    result = result && (hasUser() == other.hasUser());
    if (hasUser()) {
      result = result && getUser()
          .equals(other.getUser());
    }
    result = result && getFriendsList()
        .equals(other.getFriendsList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (getFriendsCount() > 0) {
      hash = (37 * hash) + FRIENDS_FIELD_NUMBER;
      hash = (53 * hash) + getFriendsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LoginResponseDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LoginResponseDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LoginResponseDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LoginResponseDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LoginResponseDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LoginResponseDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LoginResponseDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LoginResponseDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LoginResponseDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LoginResponseDTO parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(LoginResponseDTO prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LoginResponseDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LoginResponseDTO)
          LoginResponseDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LoginResponseDTOModel.internal_static_LoginResponseDTO_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LoginResponseDTOModel.internal_static_LoginResponseDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LoginResponseDTO.class, LoginResponseDTO.Builder.class);
    }

    // Construct using com.zh.model.LoginResponseDTO.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFriendsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      if (friendsBuilder_ == null) {
        friends_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        friendsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LoginResponseDTOModel.internal_static_LoginResponseDTO_descriptor;
    }

    public LoginResponseDTO getDefaultInstanceForType() {
      return LoginResponseDTO.getDefaultInstance();
    }

    public LoginResponseDTO build() {
      LoginResponseDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public LoginResponseDTO buildPartial() {
      LoginResponseDTO result = new LoginResponseDTO(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      if (friendsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          friends_ = java.util.Collections.unmodifiableList(friends_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.friends_ = friends_;
      } else {
        result.friends_ = friendsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof LoginResponseDTO) {
        return mergeFrom((LoginResponseDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LoginResponseDTO other) {
      if (other == LoginResponseDTO.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (friendsBuilder_ == null) {
        if (!other.friends_.isEmpty()) {
          if (friends_.isEmpty()) {
            friends_ = other.friends_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFriendsIsMutable();
            friends_.addAll(other.friends_);
          }
          onChanged();
        }
      } else {
        if (!other.friends_.isEmpty()) {
          if (friendsBuilder_.isEmpty()) {
            friendsBuilder_.dispose();
            friendsBuilder_ = null;
            friends_ = other.friends_;
            bitField0_ = (bitField0_ & ~0x00000002);
            friendsBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFriendsFieldBuilder() : null;
          } else {
            friendsBuilder_.addAllMessages(other.friends_);
          }
        }
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
      LoginResponseDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LoginResponseDTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private UserDTO user_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            UserDTO, UserDTO.Builder, UserDTOOrBuilder> userBuilder_;
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public UserDTO getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? UserDTO.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public Builder setUser(UserDTO value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public Builder setUser(
        UserDTO.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public Builder mergeUser(UserDTO value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            UserDTO.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public UserDTO.Builder getUserBuilder() {

      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    public UserDTOOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            UserDTO.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>optional .UserDTO user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            UserDTO, UserDTO.Builder, UserDTOOrBuilder>
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                UserDTO, UserDTO.Builder, UserDTOOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private java.util.List<UserDTO> friends_ =
      java.util.Collections.emptyList();
    private void ensureFriendsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        friends_ = new java.util.ArrayList<UserDTO>(friends_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            UserDTO, UserDTO.Builder, UserDTOOrBuilder> friendsBuilder_;

    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public java.util.List<UserDTO> getFriendsList() {
      if (friendsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(friends_);
      } else {
        return friendsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public int getFriendsCount() {
      if (friendsBuilder_ == null) {
        return friends_.size();
      } else {
        return friendsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public UserDTO getFriends(int index) {
      if (friendsBuilder_ == null) {
        return friends_.get(index);
      } else {
        return friendsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder setFriends(
        int index, UserDTO value) {
      if (friendsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFriendsIsMutable();
        friends_.set(index, value);
        onChanged();
      } else {
        friendsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder setFriends(
        int index, UserDTO.Builder builderForValue) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.set(index, builderForValue.build());
        onChanged();
      } else {
        friendsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder addFriends(UserDTO value) {
      if (friendsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFriendsIsMutable();
        friends_.add(value);
        onChanged();
      } else {
        friendsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder addFriends(
        int index, UserDTO value) {
      if (friendsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFriendsIsMutable();
        friends_.add(index, value);
        onChanged();
      } else {
        friendsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder addFriends(
        UserDTO.Builder builderForValue) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.add(builderForValue.build());
        onChanged();
      } else {
        friendsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder addFriends(
        int index, UserDTO.Builder builderForValue) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.add(index, builderForValue.build());
        onChanged();
      } else {
        friendsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder addAllFriends(
        Iterable<? extends UserDTO> values) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, friends_);
        onChanged();
      } else {
        friendsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder clearFriends() {
      if (friendsBuilder_ == null) {
        friends_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        friendsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public Builder removeFriends(int index) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.remove(index);
        onChanged();
      } else {
        friendsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public UserDTO.Builder getFriendsBuilder(
        int index) {
      return getFriendsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public UserDTOOrBuilder getFriendsOrBuilder(
        int index) {
      if (friendsBuilder_ == null) {
        return friends_.get(index);  } else {
        return friendsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public java.util.List<? extends UserDTOOrBuilder>
         getFriendsOrBuilderList() {
      if (friendsBuilder_ != null) {
        return friendsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(friends_);
      }
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public UserDTO.Builder addFriendsBuilder() {
      return getFriendsFieldBuilder().addBuilder(
          UserDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public UserDTO.Builder addFriendsBuilder(
        int index) {
      return getFriendsFieldBuilder().addBuilder(
          index, UserDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .UserDTO friends = 2;</code>
     */
    public java.util.List<UserDTO.Builder>
         getFriendsBuilderList() {
      return getFriendsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            UserDTO, UserDTO.Builder, UserDTOOrBuilder>
        getFriendsFieldBuilder() {
      if (friendsBuilder_ == null) {
        friendsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                UserDTO, UserDTO.Builder, UserDTOOrBuilder>(
                friends_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        friends_ = null;
      }
      return friendsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:LoginResponseDTO)
  }

  // @@protoc_insertion_point(class_scope:LoginResponseDTO)
  private static final LoginResponseDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LoginResponseDTO();
  }

  public static LoginResponseDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginResponseDTO>
      PARSER = new com.google.protobuf.AbstractParser<LoginResponseDTO>() {
    public LoginResponseDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LoginResponseDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginResponseDTO> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<LoginResponseDTO> getParserForType() {
    return PARSER;
  }

  public LoginResponseDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

