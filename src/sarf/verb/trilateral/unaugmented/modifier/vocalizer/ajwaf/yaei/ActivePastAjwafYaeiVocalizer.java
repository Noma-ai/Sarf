package sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.*;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class ActivePastAjwafYaeiVocalizer extends AbstractAjwafYaeiVocalizer {
    private List substitutions = new LinkedList();

    public ActivePastAjwafYaeiVocalizer() {
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (������� ������ �������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (��� �����ǡ �� ����� ��� �����)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (��ڡ ���� ��)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (����ǡ ����ǡ ���ǡ)
    }

    /**
     *
     * @return List
     * @todo Implement this
     *   sarf.verb.trilateral.Substitution.SubstitutionsApplier method
     */
    public List getSubstitutions() {
        return substitutions;
    }

}
