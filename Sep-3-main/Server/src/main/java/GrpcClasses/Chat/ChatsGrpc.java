package GrpcClasses.Chat;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Chat.proto")
public final class ChatsGrpc {

  private ChatsGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Chat.Chats";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpById,
      GrpcClasses.Chat.Chat.ChatModel> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Chat.Chat.lookUpById.class,
      responseType = GrpcClasses.Chat.Chat.ChatModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpById,
      GrpcClasses.Chat.Chat.ChatModel> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpById, GrpcClasses.Chat.Chat.ChatModel> getFindByIdMethod;
    if ((getFindByIdMethod = ChatsGrpc.getFindByIdMethod) == null) {
      synchronized (ChatsGrpc.class) {
        if ((getFindByIdMethod = ChatsGrpc.getFindByIdMethod) == null) {
          ChatsGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Chat.Chat.lookUpById, GrpcClasses.Chat.Chat.ChatModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.lookUpById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.ChatModel.getDefaultInstance()))
              .setSchemaDescriptor(new ChatsMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.ChatModel,
      GrpcClasses.Chat.Chat.Empty> getSaveChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveChat",
      requestType = GrpcClasses.Chat.Chat.ChatModel.class,
      responseType = GrpcClasses.Chat.Chat.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.ChatModel,
      GrpcClasses.Chat.Chat.Empty> getSaveChatMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.ChatModel, GrpcClasses.Chat.Chat.Empty> getSaveChatMethod;
    if ((getSaveChatMethod = ChatsGrpc.getSaveChatMethod) == null) {
      synchronized (ChatsGrpc.class) {
        if ((getSaveChatMethod = ChatsGrpc.getSaveChatMethod) == null) {
          ChatsGrpc.getSaveChatMethod = getSaveChatMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Chat.Chat.ChatModel, GrpcClasses.Chat.Chat.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.ChatModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ChatsMethodDescriptorSupplier("saveChat"))
              .build();
        }
      }
    }
    return getSaveChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpById,
      GrpcClasses.Chat.Chat.Empty> getDeleteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteChat",
      requestType = GrpcClasses.Chat.Chat.lookUpById.class,
      responseType = GrpcClasses.Chat.Chat.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpById,
      GrpcClasses.Chat.Chat.Empty> getDeleteChatMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpById, GrpcClasses.Chat.Chat.Empty> getDeleteChatMethod;
    if ((getDeleteChatMethod = ChatsGrpc.getDeleteChatMethod) == null) {
      synchronized (ChatsGrpc.class) {
        if ((getDeleteChatMethod = ChatsGrpc.getDeleteChatMethod) == null) {
          ChatsGrpc.getDeleteChatMethod = getDeleteChatMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Chat.Chat.lookUpById, GrpcClasses.Chat.Chat.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.lookUpById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ChatsMethodDescriptorSupplier("deleteChat"))
              .build();
        }
      }
    }
    return getDeleteChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpByUserId,
      GrpcClasses.Chat.Chat.ChatModel> getFindByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByUserId",
      requestType = GrpcClasses.Chat.Chat.lookUpByUserId.class,
      responseType = GrpcClasses.Chat.Chat.ChatModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpByUserId,
      GrpcClasses.Chat.Chat.ChatModel> getFindByUserIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Chat.Chat.lookUpByUserId, GrpcClasses.Chat.Chat.ChatModel> getFindByUserIdMethod;
    if ((getFindByUserIdMethod = ChatsGrpc.getFindByUserIdMethod) == null) {
      synchronized (ChatsGrpc.class) {
        if ((getFindByUserIdMethod = ChatsGrpc.getFindByUserIdMethod) == null) {
          ChatsGrpc.getFindByUserIdMethod = getFindByUserIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Chat.Chat.lookUpByUserId, GrpcClasses.Chat.Chat.ChatModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.lookUpByUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Chat.Chat.ChatModel.getDefaultInstance()))
              .setSchemaDescriptor(new ChatsMethodDescriptorSupplier("findByUserId"))
              .build();
        }
      }
    }
    return getFindByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatsStub>() {
        @java.lang.Override
        public ChatsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatsStub(channel, callOptions);
        }
      };
    return ChatsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatsBlockingStub>() {
        @java.lang.Override
        public ChatsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatsBlockingStub(channel, callOptions);
        }
      };
    return ChatsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatsFutureStub>() {
        @java.lang.Override
        public ChatsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatsFutureStub(channel, callOptions);
        }
      };
    return ChatsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChatsImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(GrpcClasses.Chat.Chat.lookUpById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.ChatModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveChat(GrpcClasses.Chat.Chat.ChatModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveChatMethod(), responseObserver);
    }

    /**
     */
    public void deleteChat(GrpcClasses.Chat.Chat.lookUpById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteChatMethod(), responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.Chat.Chat.lookUpByUserId request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.ChatModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Chat.Chat.lookUpById,
                GrpcClasses.Chat.Chat.ChatModel>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getSaveChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Chat.Chat.ChatModel,
                GrpcClasses.Chat.Chat.Empty>(
                  this, METHODID_SAVE_CHAT)))
          .addMethod(
            getDeleteChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Chat.Chat.lookUpById,
                GrpcClasses.Chat.Chat.Empty>(
                  this, METHODID_DELETE_CHAT)))
          .addMethod(
            getFindByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Chat.Chat.lookUpByUserId,
                GrpcClasses.Chat.Chat.ChatModel>(
                  this, METHODID_FIND_BY_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ChatsStub extends io.grpc.stub.AbstractAsyncStub<ChatsStub> {
    private ChatsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatsStub(channel, callOptions);
    }

    /**
     */
    public void findById(GrpcClasses.Chat.Chat.lookUpById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.ChatModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveChat(GrpcClasses.Chat.Chat.ChatModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChat(GrpcClasses.Chat.Chat.lookUpById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.Chat.Chat.lookUpByUserId request,
        io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.ChatModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChatsBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChatsBlockingStub> {
    private ChatsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatsBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Chat.Chat.ChatModel findById(GrpcClasses.Chat.Chat.lookUpById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Chat.Chat.Empty saveChat(GrpcClasses.Chat.Chat.ChatModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Chat.Chat.Empty deleteChat(GrpcClasses.Chat.Chat.lookUpById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Chat.Chat.ChatModel> findByUserId(
        GrpcClasses.Chat.Chat.lookUpByUserId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatsFutureStub extends io.grpc.stub.AbstractFutureStub<ChatsFutureStub> {
    private ChatsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Chat.Chat.ChatModel> findById(
        GrpcClasses.Chat.Chat.lookUpById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Chat.Chat.Empty> saveChat(
        GrpcClasses.Chat.Chat.ChatModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Chat.Chat.Empty> deleteChat(
        GrpcClasses.Chat.Chat.lookUpById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteChatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_SAVE_CHAT = 1;
  private static final int METHODID_DELETE_CHAT = 2;
  private static final int METHODID_FIND_BY_USER_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Chat.Chat.lookUpById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.ChatModel>) responseObserver);
          break;
        case METHODID_SAVE_CHAT:
          serviceImpl.saveChat((GrpcClasses.Chat.Chat.ChatModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CHAT:
          serviceImpl.deleteChat((GrpcClasses.Chat.Chat.lookUpById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID:
          serviceImpl.findByUserId((GrpcClasses.Chat.Chat.lookUpByUserId) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Chat.Chat.ChatModel>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Chat.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chats");
    }
  }

  private static final class ChatsFileDescriptorSupplier
      extends ChatsBaseDescriptorSupplier {
    ChatsFileDescriptorSupplier() {}
  }

  private static final class ChatsMethodDescriptorSupplier
      extends ChatsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatsFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getSaveChatMethod())
              .addMethod(getDeleteChatMethod())
              .addMethod(getFindByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
