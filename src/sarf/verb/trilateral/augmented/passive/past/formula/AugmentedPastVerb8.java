package sarf.verb.trilateral.augmented.passive.past.formula;

import sarf.verb.trilateral.augmented.*;
import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.augmented.*;

/**
 * <p>Title: Sarf</p>
 *
 * <p>Description: ������ �������</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class AugmentedPastVerb8 extends AugmentedPastVerb {
    public AugmentedPastVerb8(AugmentedTrilateralRoot root, String lastDpa, String connectedPronoun) {
        super(root, lastDpa, connectedPronoun);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.trilingual.augmented.past.AugmentedPastVerb
     *   method
     */
    public String form() {
        return "�"+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.DAMMA+root.getC2()+ArabCharUtil.SHADDA+ArabCharUtil.KASRA+root.getC3()+lastDpa+connectedPronoun;
    }
}
