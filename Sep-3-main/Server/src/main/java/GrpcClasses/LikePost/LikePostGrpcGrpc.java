package GrpcClasses.LikePost;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: LikePost.proto")
public final class LikePostGrpcGrpc {

  private LikePostGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.LikePost.LikePostGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.LikeModelGrpc,
      GrpcClasses.LikePost.LikePost.Empty> getSaveLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveLike",
      requestType = GrpcClasses.LikePost.LikePost.LikeModelGrpc.class,
      responseType = GrpcClasses.LikePost.LikePost.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.LikeModelGrpc,
      GrpcClasses.LikePost.LikePost.Empty> getSaveLikeMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.LikeModelGrpc, GrpcClasses.LikePost.LikePost.Empty> getSaveLikeMethod;
    if ((getSaveLikeMethod = LikePostGrpcGrpc.getSaveLikeMethod) == null) {
      synchronized (LikePostGrpcGrpc.class) {
        if ((getSaveLikeMethod = LikePostGrpcGrpc.getSaveLikeMethod) == null) {
          LikePostGrpcGrpc.getSaveLikeMethod = getSaveLikeMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.LikePost.LikePost.LikeModelGrpc, GrpcClasses.LikePost.LikePost.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.LikeModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LikePostGrpcMethodDescriptorSupplier("saveLike"))
              .build();
        }
      }
    }
    return getSaveLikeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.PostUserId,
      GrpcClasses.LikePost.LikePost.Empty> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = GrpcClasses.LikePost.LikePost.PostUserId.class,
      responseType = GrpcClasses.LikePost.LikePost.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.PostUserId,
      GrpcClasses.LikePost.LikePost.Empty> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.PostUserId, GrpcClasses.LikePost.LikePost.Empty> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = LikePostGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (LikePostGrpcGrpc.class) {
        if ((getDeleteByIdMethod = LikePostGrpcGrpc.getDeleteByIdMethod) == null) {
          LikePostGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.LikePost.LikePost.PostUserId, GrpcClasses.LikePost.LikePost.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.PostUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LikePostGrpcMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.GetById,
      GrpcClasses.LikePost.LikePost.Count> getFindLikesByPostIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findLikesByPostId",
      requestType = GrpcClasses.LikePost.LikePost.GetById.class,
      responseType = GrpcClasses.LikePost.LikePost.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.GetById,
      GrpcClasses.LikePost.LikePost.Count> getFindLikesByPostIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.GetById, GrpcClasses.LikePost.LikePost.Count> getFindLikesByPostIdMethod;
    if ((getFindLikesByPostIdMethod = LikePostGrpcGrpc.getFindLikesByPostIdMethod) == null) {
      synchronized (LikePostGrpcGrpc.class) {
        if ((getFindLikesByPostIdMethod = LikePostGrpcGrpc.getFindLikesByPostIdMethod) == null) {
          LikePostGrpcGrpc.getFindLikesByPostIdMethod = getFindLikesByPostIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.LikePost.LikePost.GetById, GrpcClasses.LikePost.LikePost.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findLikesByPostId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.Count.getDefaultInstance()))
              .setSchemaDescriptor(new LikePostGrpcMethodDescriptorSupplier("findLikesByPostId"))
              .build();
        }
      }
    }
    return getFindLikesByPostIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.PostUserId,
      GrpcClasses.LikePost.LikePost.IsLiked> getFindByPostLikedAndUserLikingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByPostLikedAndUserLiking",
      requestType = GrpcClasses.LikePost.LikePost.PostUserId.class,
      responseType = GrpcClasses.LikePost.LikePost.IsLiked.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.PostUserId,
      GrpcClasses.LikePost.LikePost.IsLiked> getFindByPostLikedAndUserLikingMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.LikePost.LikePost.PostUserId, GrpcClasses.LikePost.LikePost.IsLiked> getFindByPostLikedAndUserLikingMethod;
    if ((getFindByPostLikedAndUserLikingMethod = LikePostGrpcGrpc.getFindByPostLikedAndUserLikingMethod) == null) {
      synchronized (LikePostGrpcGrpc.class) {
        if ((getFindByPostLikedAndUserLikingMethod = LikePostGrpcGrpc.getFindByPostLikedAndUserLikingMethod) == null) {
          LikePostGrpcGrpc.getFindByPostLikedAndUserLikingMethod = getFindByPostLikedAndUserLikingMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.LikePost.LikePost.PostUserId, GrpcClasses.LikePost.LikePost.IsLiked>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByPostLikedAndUserLiking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.PostUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.LikePost.LikePost.IsLiked.getDefaultInstance()))
              .setSchemaDescriptor(new LikePostGrpcMethodDescriptorSupplier("findByPostLikedAndUserLiking"))
              .build();
        }
      }
    }
    return getFindByPostLikedAndUserLikingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LikePostGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LikePostGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LikePostGrpcStub>() {
        @java.lang.Override
        public LikePostGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LikePostGrpcStub(channel, callOptions);
        }
      };
    return LikePostGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LikePostGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LikePostGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LikePostGrpcBlockingStub>() {
        @java.lang.Override
        public LikePostGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LikePostGrpcBlockingStub(channel, callOptions);
        }
      };
    return LikePostGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LikePostGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LikePostGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LikePostGrpcFutureStub>() {
        @java.lang.Override
        public LikePostGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LikePostGrpcFutureStub(channel, callOptions);
        }
      };
    return LikePostGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LikePostGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveLike(GrpcClasses.LikePost.LikePost.LikeModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveLikeMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(GrpcClasses.LikePost.LikePost.PostUserId request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    /**
     */
    public void findLikesByPostId(GrpcClasses.LikePost.LikePost.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindLikesByPostIdMethod(), responseObserver);
    }

    /**
     */
    public void findByPostLikedAndUserLiking(GrpcClasses.LikePost.LikePost.PostUserId request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.IsLiked> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByPostLikedAndUserLikingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveLikeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.LikePost.LikePost.LikeModelGrpc,
                GrpcClasses.LikePost.LikePost.Empty>(
                  this, METHODID_SAVE_LIKE)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.LikePost.LikePost.PostUserId,
                GrpcClasses.LikePost.LikePost.Empty>(
                  this, METHODID_DELETE_BY_ID)))
          .addMethod(
            getFindLikesByPostIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.LikePost.LikePost.GetById,
                GrpcClasses.LikePost.LikePost.Count>(
                  this, METHODID_FIND_LIKES_BY_POST_ID)))
          .addMethod(
            getFindByPostLikedAndUserLikingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.LikePost.LikePost.PostUserId,
                GrpcClasses.LikePost.LikePost.IsLiked>(
                  this, METHODID_FIND_BY_POST_LIKED_AND_USER_LIKING)))
          .build();
    }
  }

  /**
   */
  public static final class LikePostGrpcStub extends io.grpc.stub.AbstractAsyncStub<LikePostGrpcStub> {
    private LikePostGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LikePostGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LikePostGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveLike(GrpcClasses.LikePost.LikePost.LikeModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveLikeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(GrpcClasses.LikePost.LikePost.PostUserId request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findLikesByPostId(GrpcClasses.LikePost.LikePost.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindLikesByPostIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByPostLikedAndUserLiking(GrpcClasses.LikePost.LikePost.PostUserId request,
        io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.IsLiked> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByPostLikedAndUserLikingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LikePostGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<LikePostGrpcBlockingStub> {
    private LikePostGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LikePostGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LikePostGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.LikePost.LikePost.Empty saveLike(GrpcClasses.LikePost.LikePost.LikeModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveLikeMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.LikePost.LikePost.Empty deleteById(GrpcClasses.LikePost.LikePost.PostUserId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.LikePost.LikePost.Count findLikesByPostId(GrpcClasses.LikePost.LikePost.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindLikesByPostIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.LikePost.LikePost.IsLiked findByPostLikedAndUserLiking(GrpcClasses.LikePost.LikePost.PostUserId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByPostLikedAndUserLikingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LikePostGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<LikePostGrpcFutureStub> {
    private LikePostGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LikePostGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LikePostGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.LikePost.LikePost.Empty> saveLike(
        GrpcClasses.LikePost.LikePost.LikeModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveLikeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.LikePost.LikePost.Empty> deleteById(
        GrpcClasses.LikePost.LikePost.PostUserId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.LikePost.LikePost.Count> findLikesByPostId(
        GrpcClasses.LikePost.LikePost.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindLikesByPostIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.LikePost.LikePost.IsLiked> findByPostLikedAndUserLiking(
        GrpcClasses.LikePost.LikePost.PostUserId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByPostLikedAndUserLikingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_LIKE = 0;
  private static final int METHODID_DELETE_BY_ID = 1;
  private static final int METHODID_FIND_LIKES_BY_POST_ID = 2;
  private static final int METHODID_FIND_BY_POST_LIKED_AND_USER_LIKING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LikePostGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LikePostGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_LIKE:
          serviceImpl.saveLike((GrpcClasses.LikePost.LikePost.LikeModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Empty>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((GrpcClasses.LikePost.LikePost.PostUserId) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Empty>) responseObserver);
          break;
        case METHODID_FIND_LIKES_BY_POST_ID:
          serviceImpl.findLikesByPostId((GrpcClasses.LikePost.LikePost.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.Count>) responseObserver);
          break;
        case METHODID_FIND_BY_POST_LIKED_AND_USER_LIKING:
          serviceImpl.findByPostLikedAndUserLiking((GrpcClasses.LikePost.LikePost.PostUserId) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.LikePost.LikePost.IsLiked>) responseObserver);
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

  private static abstract class LikePostGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LikePostGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.LikePost.LikePost.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LikePostGrpc");
    }
  }

  private static final class LikePostGrpcFileDescriptorSupplier
      extends LikePostGrpcBaseDescriptorSupplier {
    LikePostGrpcFileDescriptorSupplier() {}
  }

  private static final class LikePostGrpcMethodDescriptorSupplier
      extends LikePostGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LikePostGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (LikePostGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LikePostGrpcFileDescriptorSupplier())
              .addMethod(getSaveLikeMethod())
              .addMethod(getDeleteByIdMethod())
              .addMethod(getFindLikesByPostIdMethod())
              .addMethod(getFindByPostLikedAndUserLikingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
