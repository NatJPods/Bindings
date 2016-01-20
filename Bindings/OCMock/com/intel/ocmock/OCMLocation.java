package com.intel.ocmock;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMLocation extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMLocation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMLocation alloc();

	@Generated
	@Selector("file")
	public native String file();

	@Generated
	@Selector("init")
	public native OCMLocation init();

	@Generated
	@Selector("initWithTestCase:file:line:")
	public native OCMLocation initWithTestCaseFileLine(
			@Mapped(ObjCObjectMapper.class) Object aTestCase, String aFile,
			@NUInt long aLine);

	@Generated
	@Selector("line")
	@NUInt
	public native long line();

	@Generated
	@Selector("locationWithTestCase:file:line:")
	public static native OCMLocation locationWithTestCaseFileLine(
			@Mapped(ObjCObjectMapper.class) Object aTestCase, String aFile,
			@NUInt long aLine);

	@Generated
	@Selector("testCase")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object testCase();
}