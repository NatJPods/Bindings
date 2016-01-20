package com.intel.ocmock.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import ios.foundation.NSNotificationCenter;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSNotificationCenter.class)
public final class NSNotificationCenterExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSNotificationCenterExt() {
	}
}