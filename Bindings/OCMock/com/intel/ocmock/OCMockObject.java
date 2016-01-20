package com.intel.ocmock;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSInvocation;
import ios.foundation.NSProxy;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMockObject extends NSProxy {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMockObject(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMockObject alloc();

	@Generated
	@Selector("expect")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object expect();

	@Generated
	@Selector("handleInvocation:")
	public native boolean handleInvocation(NSInvocation anInvocation);

	@Generated
	@Selector("handleSelector:")
	public native boolean handleSelector(SEL sel);

	@Generated
	@Selector("handleUnRecordedInvocation:")
	public native void handleUnRecordedInvocation(NSInvocation anInvocation);

	@Generated
	@Selector("init")
	public native OCMockObject init();

	@Generated
	@Selector("mockForClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mockForClass(Class aClass);

	@Generated
	@Selector("niceMockForClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object niceMockForClass(Class aClass);

	@Generated
	@Selector("observerMock")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object observerMock();

	@Generated
	@Selector("partialMockForObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object partialMockForObject(NSObject anObject);

	@Generated
	@Selector("reject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object reject();

	@Generated
	@Selector("setExpectationOrderMatters:")
	public native void setExpectationOrderMatters(boolean flag);

	@Generated
	@Selector("stopMocking")
	public native void stopMocking();

	@Generated
	@Selector("stub")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object stub();

	@Generated
	@Selector("verify")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object verify();

	@Generated
	@Selector("verifyAtLocation:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object verifyAtLocation(OCMLocation location);

	@Generated
	@Selector("verifyWithDelay:")
	public native void verifyWithDelay(double delay);

	@Generated
	@Selector("verifyWithDelay:atLocation:")
	public native void verifyWithDelayAtLocation(double delay,
			OCMLocation location);
}