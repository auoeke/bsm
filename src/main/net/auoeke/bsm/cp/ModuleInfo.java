package net.auoeke.bsm.cp;

import net.auoeke.bsm.Constants;

public class ModuleInfo implements CPInfo {
    public char nameIndex;

    @Override
    public byte tag() {
        return Constants.Constant.MODULE;
    }
}
