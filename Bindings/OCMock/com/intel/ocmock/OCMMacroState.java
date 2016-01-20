package com.intel.ocmock;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMMacroState extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMMacroState(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMMacroState alloc();

	@Generated
	@Selector("beginExpectMacro")
	public static native void beginExpectMacro();

	@Generated
	@Selector("beginStubMacro")
	public static native void beginStubMacro();

	@Generated
	@Selector("beginVerifyMacroAtLocation:")
	public static native void beginVerifyMacroAtLocation(OCMLocation aLocation);

	@Generated
	@Selector("endExpectMacro")
	public static native OCMStubRecorder endExpectMacro();

	@Generated
	@Selector("endStubMacro")
	public static native OCMStubRecorder endStubMacro();

	@Generated
	@Selector("endVerifyMacro")
	public static native void endVerifyMacro();

	@Generated
	@Selector("globalState")
	public static native OCMMacroState globalState();

	@Generated
	@Selector("init")
	public native OCMMacroState init();

	@Generated
	@Selector("recorder")
	public native OCMRecorder recorder();

	@Generated
	@Selector("switchToClassMethod")
	public native void switchToClassMethod();
}