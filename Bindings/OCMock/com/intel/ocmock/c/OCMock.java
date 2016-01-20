package com.intel.ocmock.c;


import com.intel.inde.moe.natj.c.CRuntime;
import com.intel.inde.moe.natj.c.ann.CFunction;
import com.intel.inde.moe.natj.c.ann.CVariable;
import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ann.UncertainArgument;
import com.intel.inde.moe.natj.general.ptr.ConstBytePtr;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.ocmock.OCMLocation;

@Generated
@Library("OCMock")
@Runtime(CRuntime.class)
public final class OCMock {
	static {
		NatJ.register();
	}

	@Generated
	private OCMock() {
	}

	@Generated
	@CFunction
	public static native boolean OCMIsObjectType(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String objCType);

	@Generated
	@CFunction
	public static native OCMLocation OCMMakeLocation(
			@Mapped(ObjCObjectMapper.class) Object testCase,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String file,
			int line);

	@Generated
	@CVariable()
	public static native double OCMockVersionNumber();

	@Generated
	@CVariable()
	public static native ConstBytePtr OCMockVersionString();
}