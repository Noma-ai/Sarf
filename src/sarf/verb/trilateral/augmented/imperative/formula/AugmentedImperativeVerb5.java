package sarf.verb.trilateral.augmented.imperative.formula;

import sarf.verb.trilateral.augmented.*;
import sarf.util.*;
import sarf.verb.trilateral.augmented.imperative.*;

/**
 * <p>Title: Sarf</p>
 *
 * <p>Description: ?????? ???????</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class AugmentedImperativeVerb5 extends AugmentedImperativeVerb {

    public AugmentedImperativeVerb5(AugmentedTrilateralRoot root,  String lastDim, String connectedPronoun) {
        super(root, lastDim, connectedPronoun);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.trilingual.augmented.imperative.AugmentedImperativeVerb
     *   method
     */
    public String form() {
        return "�"+root.getC1()+ArabCharUtil.SKOON+"�"+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.KASRA+root.getC3()+lastDim+connectedPronoun;
    }
}
