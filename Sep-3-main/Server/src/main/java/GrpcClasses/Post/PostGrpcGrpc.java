package GrpcClasses.Post;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Post.proto")
public final class PostGrpcGrpc {

  private PostGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Post.PostGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.PostModelGrpc,
      GrpcClasses.Post.Post.Empty> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPost",
      requestType = GrpcClasses.Post.Post.PostModelGrpc.class,
      responseType = GrpcClasses.Post.Post.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.PostModelGrpc,
      GrpcClasses.Post.Post.Empty> getCreatePostMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.PostModelGrpc, GrpcClasses.Post.Post.Empty> getCreatePostMethod;
    if ((getCreatePostMethod = PostGrpcGrpc.getCreatePostMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getCreatePostMethod = PostGrpcGrpc.getCreatePostMethod) == null) {
          PostGrpcGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.PostModelGrpc, GrpcClasses.Post.Post.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.PostModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("createPost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById,
      GrpcClasses.Post.Post.PostModelGrpc> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Post.Post.GetById.class,
      responseType = GrpcClasses.Post.Post.PostModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById,
      GrpcClasses.Post.Post.PostModelGrpc> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById, GrpcClasses.Post.Post.PostModelGrpc> getFindByIdMethod;
    if ((getFindByIdMethod = PostGrpcGrpc.getFindByIdMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getFindByIdMethod = PostGrpcGrpc.getFindByIdMethod) == null) {
          PostGrpcGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.GetById, GrpcClasses.Post.Post.PostModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.PostModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.PostModelGrpc,
      GrpcClasses.Post.Post.Empty> getUpdatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePost",
      requestType = GrpcClasses.Post.Post.PostModelGrpc.class,
      responseType = GrpcClasses.Post.Post.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.PostModelGrpc,
      GrpcClasses.Post.Post.Empty> getUpdatePostMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.PostModelGrpc, GrpcClasses.Post.Post.Empty> getUpdatePostMethod;
    if ((getUpdatePostMethod = PostGrpcGrpc.getUpdatePostMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getUpdatePostMethod = PostGrpcGrpc.getUpdatePostMethod) == null) {
          PostGrpcGrpc.getUpdatePostMethod = getUpdatePostMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.PostModelGrpc, GrpcClasses.Post.Post.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.PostModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("updatePost"))
              .build();
        }
      }
    }
    return getUpdatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById,
      GrpcClasses.Post.Post.Empty> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePost",
      requestType = GrpcClasses.Post.Post.GetById.class,
      responseType = GrpcClasses.Post.Post.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById,
      GrpcClasses.Post.Post.Empty> getDeletePostMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById, GrpcClasses.Post.Post.Empty> getDeletePostMethod;
    if ((getDeletePostMethod = PostGrpcGrpc.getDeletePostMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getDeletePostMethod = PostGrpcGrpc.getDeletePostMethod) == null) {
          PostGrpcGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.GetById, GrpcClasses.Post.Post.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("deletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.SearchParameters,
      GrpcClasses.Post.Post.PostModelGrpc> getFindByParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByParameters",
      requestType = GrpcClasses.Post.Post.SearchParameters.class,
      responseType = GrpcClasses.Post.Post.PostModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.SearchParameters,
      GrpcClasses.Post.Post.PostModelGrpc> getFindByParametersMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.SearchParameters, GrpcClasses.Post.Post.PostModelGrpc> getFindByParametersMethod;
    if ((getFindByParametersMethod = PostGrpcGrpc.getFindByParametersMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getFindByParametersMethod = PostGrpcGrpc.getFindByParametersMethod) == null) {
          PostGrpcGrpc.getFindByParametersMethod = getFindByParametersMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.SearchParameters, GrpcClasses.Post.Post.PostModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.SearchParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.PostModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("findByParameters"))
              .build();
        }
      }
    }
    return getFindByParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.Empty,
      GrpcClasses.Post.Post.PostModelGrpc> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = GrpcClasses.Post.Post.Empty.class,
      responseType = GrpcClasses.Post.Post.PostModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.Empty,
      GrpcClasses.Post.Post.PostModelGrpc> getFindAllMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.Empty, GrpcClasses.Post.Post.PostModelGrpc> getFindAllMethod;
    if ((getFindAllMethod = PostGrpcGrpc.getFindAllMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getFindAllMethod = PostGrpcGrpc.getFindAllMethod) == null) {
          PostGrpcGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.Empty, GrpcClasses.Post.Post.PostModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.PostModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById,
      GrpcClasses.Post.Post.PostModelGrpc> getFindByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByUserId",
      requestType = GrpcClasses.Post.Post.GetById.class,
      responseType = GrpcClasses.Post.Post.PostModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById,
      GrpcClasses.Post.Post.PostModelGrpc> getFindByUserIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Post.Post.GetById, GrpcClasses.Post.Post.PostModelGrpc> getFindByUserIdMethod;
    if ((getFindByUserIdMethod = PostGrpcGrpc.getFindByUserIdMethod) == null) {
      synchronized (PostGrpcGrpc.class) {
        if ((getFindByUserIdMethod = PostGrpcGrpc.getFindByUserIdMethod) == null) {
          PostGrpcGrpc.getFindByUserIdMethod = getFindByUserIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Post.Post.GetById, GrpcClasses.Post.Post.PostModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Post.Post.PostModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new PostGrpcMethodDescriptorSupplier("findByUserId"))
              .build();
        }
      }
    }
    return getFindByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostGrpcStub>() {
        @java.lang.Override
        public PostGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostGrpcStub(channel, callOptions);
        }
      };
    return PostGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostGrpcBlockingStub>() {
        @java.lang.Override
        public PostGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostGrpcBlockingStub(channel, callOptions);
        }
      };
    return PostGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostGrpcFutureStub>() {
        @java.lang.Override
        public PostGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostGrpcFutureStub(channel, callOptions);
        }
      };
    return PostGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PostGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPost(GrpcClasses.Post.Post.PostModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Post.Post.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void updatePost(GrpcClasses.Post.Post.PostModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(GrpcClasses.Post.Post.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void findByParameters(GrpcClasses.Post.Post.SearchParameters request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByParametersMethod(), responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.Post.Post.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.Post.Post.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.PostModelGrpc,
                GrpcClasses.Post.Post.Empty>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.GetById,
                GrpcClasses.Post.Post.PostModelGrpc>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getUpdatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.PostModelGrpc,
                GrpcClasses.Post.Post.Empty>(
                  this, METHODID_UPDATE_POST)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.GetById,
                GrpcClasses.Post.Post.Empty>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getFindByParametersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.SearchParameters,
                GrpcClasses.Post.Post.PostModelGrpc>(
                  this, METHODID_FIND_BY_PARAMETERS)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.Empty,
                GrpcClasses.Post.Post.PostModelGrpc>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getFindByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.GetById,
                GrpcClasses.Post.Post.PostModelGrpc>(
                  this, METHODID_FIND_BY_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class PostGrpcStub extends io.grpc.stub.AbstractAsyncStub<PostGrpcStub> {
    private PostGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostGrpcStub(channel, callOptions);
    }

    /**
     */
    public void createPost(GrpcClasses.Post.Post.PostModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Post.Post.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePost(GrpcClasses.Post.Post.PostModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(GrpcClasses.Post.Post.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByParameters(GrpcClasses.Post.Post.SearchParameters request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.Post.Post.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.Post.Post.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PostGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<PostGrpcBlockingStub> {
    private PostGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Post.Post.Empty createPost(GrpcClasses.Post.Post.PostModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Post.Post.PostModelGrpc findById(GrpcClasses.Post.Post.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Post.Post.Empty updatePost(GrpcClasses.Post.Post.PostModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Post.Post.Empty deletePost(GrpcClasses.Post.Post.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Post.Post.PostModelGrpc> findByParameters(
        GrpcClasses.Post.Post.SearchParameters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Post.Post.PostModelGrpc> findAll(
        GrpcClasses.Post.Post.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Post.Post.PostModelGrpc> findByUserId(
        GrpcClasses.Post.Post.GetById request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PostGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<PostGrpcFutureStub> {
    private PostGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Post.Post.Empty> createPost(
        GrpcClasses.Post.Post.PostModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Post.Post.PostModelGrpc> findById(
        GrpcClasses.Post.Post.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Post.Post.Empty> updatePost(
        GrpcClasses.Post.Post.PostModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Post.Post.Empty> deletePost(
        GrpcClasses.Post.Post.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_UPDATE_POST = 2;
  private static final int METHODID_DELETE_POST = 3;
  private static final int METHODID_FIND_BY_PARAMETERS = 4;
  private static final int METHODID_FIND_ALL = 5;
  private static final int METHODID_FIND_BY_USER_ID = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PostGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PostGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST:
          serviceImpl.createPost((GrpcClasses.Post.Post.PostModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Post.Post.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((GrpcClasses.Post.Post.PostModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((GrpcClasses.Post.Post.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_PARAMETERS:
          serviceImpl.findByParameters((GrpcClasses.Post.Post.SearchParameters) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((GrpcClasses.Post.Post.Empty) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID:
          serviceImpl.findByUserId((GrpcClasses.Post.Post.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Post.Post.PostModelGrpc>) responseObserver);
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

  private static abstract class PostGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Post.Post.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostGrpc");
    }
  }

  private static final class PostGrpcFileDescriptorSupplier
      extends PostGrpcBaseDescriptorSupplier {
    PostGrpcFileDescriptorSupplier() {}
  }

  private static final class PostGrpcMethodDescriptorSupplier
      extends PostGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PostGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (PostGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostGrpcFileDescriptorSupplier())
              .addMethod(getCreatePostMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getUpdatePostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getFindByParametersMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getFindByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
