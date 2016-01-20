package com.intel.ocmock;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSProxy;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMRecorder extends NSProxy {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMRecorder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMRecorder alloc();

	@Generated
	@Selector("classMethod")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object classMethod();

	@Generated
	@Selector("ignoringNonObjectArgs")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object ignoringNonObjectArgs();

	@Generated
	@Selector("init")
	public native OCMRecorder init();

	@Generated
	@Selector("initWithMockObject:")
	public native OCMRecorder initWithMockObject(OCMockObject aMockObject);

	@Generated
	@Selector("setMockObject:")
	public native void setMockObject(OCMockObject aMockObject);
}