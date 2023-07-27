package GrpcClasses.Location;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Location.proto")
public final class LocationGrpcGrpc {

  private LocationGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Location.LocationGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Location.Location.LocationModelGrpc,
      GrpcClasses.Location.Location.Empty> getSaveLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveLocation",
      requestType = GrpcClasses.Location.Location.LocationModelGrpc.class,
      responseType = GrpcClasses.Location.Location.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Location.Location.LocationModelGrpc,
      GrpcClasses.Location.Location.Empty> getSaveLocationMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Location.Location.LocationModelGrpc, GrpcClasses.Location.Location.Empty> getSaveLocationMethod;
    if ((getSaveLocationMethod = LocationGrpcGrpc.getSaveLocationMethod) == null) {
      synchronized (LocationGrpcGrpc.class) {
        if ((getSaveLocationMethod = LocationGrpcGrpc.getSaveLocationMethod) == null) {
          LocationGrpcGrpc.getSaveLocationMethod = getSaveLocationMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Location.Location.LocationModelGrpc, GrpcClasses.Location.Location.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Location.Location.LocationModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Location.Location.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LocationGrpcMethodDescriptorSupplier("saveLocation"))
              .build();
        }
      }
    }
    return getSaveLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Location.Location.Empty,
      GrpcClasses.Location.Location.LocationModelGrpc> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = GrpcClasses.Location.Location.Empty.class,
      responseType = GrpcClasses.Location.Location.LocationModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Location.Location.Empty,
      GrpcClasses.Location.Location.LocationModelGrpc> getFindAllMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Location.Location.Empty, GrpcClasses.Location.Location.LocationModelGrpc> getFindAllMethod;
    if ((getFindAllMethod = LocationGrpcGrpc.getFindAllMethod) == null) {
      synchronized (LocationGrpcGrpc.class) {
        if ((getFindAllMethod = LocationGrpcGrpc.getFindAllMethod) == null) {
          LocationGrpcGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Location.Location.Empty, GrpcClasses.Location.Location.LocationModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Location.Location.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Location.Location.LocationModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new LocationGrpcMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Location.Location.GetByPostId,
      GrpcClasses.Location.Location.LocationModelGrpc> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Location.Location.GetByPostId.class,
      responseType = GrpcClasses.Location.Location.LocationModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Location.Location.GetByPostId,
      GrpcClasses.Location.Location.LocationModelGrpc> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Location.Location.GetByPostId, GrpcClasses.Location.Location.LocationModelGrpc> getFindByIdMethod;
    if ((getFindByIdMethod = LocationGrpcGrpc.getFindByIdMethod) == null) {
      synchronized (LocationGrpcGrpc.class) {
        if ((getFindByIdMethod = LocationGrpcGrpc.getFindByIdMethod) == null) {
          LocationGrpcGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Location.Location.GetByPostId, GrpcClasses.Location.Location.LocationModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Location.Location.GetByPostId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Location.Location.LocationModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new LocationGrpcMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationGrpcStub>() {
        @java.lang.Override
        public LocationGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationGrpcStub(channel, callOptions);
        }
      };
    return LocationGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationGrpcBlockingStub>() {
        @java.lang.Override
        public LocationGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationGrpcBlockingStub(channel, callOptions);
        }
      };
    return LocationGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationGrpcFutureStub>() {
        @java.lang.Override
        public LocationGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationGrpcFutureStub(channel, callOptions);
        }
      };
    return LocationGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LocationGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveLocation(GrpcClasses.Location.Location.LocationModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveLocationMethod(), responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.Location.Location.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.LocationModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Location.Location.GetByPostId request,
        io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.LocationModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Location.Location.LocationModelGrpc,
                GrpcClasses.Location.Location.Empty>(
                  this, METHODID_SAVE_LOCATION)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Location.Location.Empty,
                GrpcClasses.Location.Location.LocationModelGrpc>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Location.Location.GetByPostId,
                GrpcClasses.Location.Location.LocationModelGrpc>(
                  this, METHODID_FIND_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class LocationGrpcStub extends io.grpc.stub.AbstractAsyncStub<LocationGrpcStub> {
    private LocationGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveLocation(GrpcClasses.Location.Location.LocationModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.Location.Location.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.LocationModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Location.Location.GetByPostId request,
        io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.LocationModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<LocationGrpcBlockingStub> {
    private LocationGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Location.Location.Empty saveLocation(GrpcClasses.Location.Location.LocationModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Location.Location.LocationModelGrpc> findAll(
        GrpcClasses.Location.Location.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Location.Location.LocationModelGrpc findById(GrpcClasses.Location.Location.GetByPostId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<LocationGrpcFutureStub> {
    private LocationGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Location.Location.Empty> saveLocation(
        GrpcClasses.Location.Location.LocationModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Location.Location.LocationModelGrpc> findById(
        GrpcClasses.Location.Location.GetByPostId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_LOCATION = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_FIND_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_LOCATION:
          serviceImpl.saveLocation((GrpcClasses.Location.Location.LocationModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.Empty>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((GrpcClasses.Location.Location.Empty) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.LocationModelGrpc>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Location.Location.GetByPostId) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Location.Location.LocationModelGrpc>) responseObserver);
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

  private static abstract class LocationGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Location.Location.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationGrpc");
    }
  }

  private static final class LocationGrpcFileDescriptorSupplier
      extends LocationGrpcBaseDescriptorSupplier {
    LocationGrpcFileDescriptorSupplier() {}
  }

  private static final class LocationGrpcMethodDescriptorSupplier
      extends LocationGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationGrpcFileDescriptorSupplier())
              .addMethod(getSaveLocationMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getFindByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
