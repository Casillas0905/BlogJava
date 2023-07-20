package GrpcClasses.Comment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Comment.proto")
public final class CommentGrpcGrpc {

  private CommentGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Comment.CommentGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Comment.Comment.CommentModelGrpc,
      GrpcClasses.Comment.Comment.Empty> getSaveCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveComment",
      requestType = GrpcClasses.Comment.Comment.CommentModelGrpc.class,
      responseType = GrpcClasses.Comment.Comment.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Comment.Comment.CommentModelGrpc,
      GrpcClasses.Comment.Comment.Empty> getSaveCommentMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Comment.Comment.CommentModelGrpc, GrpcClasses.Comment.Comment.Empty> getSaveCommentMethod;
    if ((getSaveCommentMethod = CommentGrpcGrpc.getSaveCommentMethod) == null) {
      synchronized (CommentGrpcGrpc.class) {
        if ((getSaveCommentMethod = CommentGrpcGrpc.getSaveCommentMethod) == null) {
          CommentGrpcGrpc.getSaveCommentMethod = getSaveCommentMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Comment.Comment.CommentModelGrpc, GrpcClasses.Comment.Comment.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Comment.Comment.CommentModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Comment.Comment.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CommentGrpcMethodDescriptorSupplier("saveComment"))
              .build();
        }
      }
    }
    return getSaveCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Comment.Comment.GetByPostId,
      GrpcClasses.Comment.Comment.CommentModelGrpc> getFindByPostIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByPostId",
      requestType = GrpcClasses.Comment.Comment.GetByPostId.class,
      responseType = GrpcClasses.Comment.Comment.CommentModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Comment.Comment.GetByPostId,
      GrpcClasses.Comment.Comment.CommentModelGrpc> getFindByPostIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Comment.Comment.GetByPostId, GrpcClasses.Comment.Comment.CommentModelGrpc> getFindByPostIdMethod;
    if ((getFindByPostIdMethod = CommentGrpcGrpc.getFindByPostIdMethod) == null) {
      synchronized (CommentGrpcGrpc.class) {
        if ((getFindByPostIdMethod = CommentGrpcGrpc.getFindByPostIdMethod) == null) {
          CommentGrpcGrpc.getFindByPostIdMethod = getFindByPostIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Comment.Comment.GetByPostId, GrpcClasses.Comment.Comment.CommentModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByPostId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Comment.Comment.GetByPostId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Comment.Comment.CommentModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new CommentGrpcMethodDescriptorSupplier("findByPostId"))
              .build();
        }
      }
    }
    return getFindByPostIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentGrpcStub>() {
        @java.lang.Override
        public CommentGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentGrpcStub(channel, callOptions);
        }
      };
    return CommentGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentGrpcBlockingStub>() {
        @java.lang.Override
        public CommentGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentGrpcBlockingStub(channel, callOptions);
        }
      };
    return CommentGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentGrpcFutureStub>() {
        @java.lang.Override
        public CommentGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentGrpcFutureStub(channel, callOptions);
        }
      };
    return CommentGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CommentGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveComment(GrpcClasses.Comment.Comment.CommentModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Comment.Comment.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCommentMethod(), responseObserver);
    }

    /**
     */
    public void findByPostId(GrpcClasses.Comment.Comment.GetByPostId request,
        io.grpc.stub.StreamObserver<GrpcClasses.Comment.Comment.CommentModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByPostIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Comment.Comment.CommentModelGrpc,
                GrpcClasses.Comment.Comment.Empty>(
                  this, METHODID_SAVE_COMMENT)))
          .addMethod(
            getFindByPostIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Comment.Comment.GetByPostId,
                GrpcClasses.Comment.Comment.CommentModelGrpc>(
                  this, METHODID_FIND_BY_POST_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CommentGrpcStub extends io.grpc.stub.AbstractAsyncStub<CommentGrpcStub> {
    private CommentGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveComment(GrpcClasses.Comment.Comment.CommentModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Comment.Comment.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByPostId(GrpcClasses.Comment.Comment.GetByPostId request,
        io.grpc.stub.StreamObserver<GrpcClasses.Comment.Comment.CommentModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByPostIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommentGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommentGrpcBlockingStub> {
    private CommentGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Comment.Comment.Empty saveComment(GrpcClasses.Comment.Comment.CommentModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Comment.Comment.CommentModelGrpc> findByPostId(
        GrpcClasses.Comment.Comment.GetByPostId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByPostIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommentGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<CommentGrpcFutureStub> {
    private CommentGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Comment.Comment.Empty> saveComment(
        GrpcClasses.Comment.Comment.CommentModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCommentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_COMMENT = 0;
  private static final int METHODID_FIND_BY_POST_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommentGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_COMMENT:
          serviceImpl.saveComment((GrpcClasses.Comment.Comment.CommentModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Comment.Comment.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_POST_ID:
          serviceImpl.findByPostId((GrpcClasses.Comment.Comment.GetByPostId) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Comment.Comment.CommentModelGrpc>) responseObserver);
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

  private static abstract class CommentGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Comment.Comment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentGrpc");
    }
  }

  private static final class CommentGrpcFileDescriptorSupplier
      extends CommentGrpcBaseDescriptorSupplier {
    CommentGrpcFileDescriptorSupplier() {}
  }

  private static final class CommentGrpcMethodDescriptorSupplier
      extends CommentGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommentGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommentGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentGrpcFileDescriptorSupplier())
              .addMethod(getSaveCommentMethod())
              .addMethod(getFindByPostIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
