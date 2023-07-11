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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Post.Post.PostModelGrpc,
                GrpcClasses.Post.Post.Empty>(
                  this, METHODID_CREATE_POST)))
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
  }

  private static final int METHODID_CREATE_POST = 0;

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
              .build();
        }
      }
    }
    return result;
  }
}
