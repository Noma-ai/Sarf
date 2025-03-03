package sarf.verb.quadriliteral.modifier.hamza.ended.active;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;

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
public class PresentMahmouz extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PresentMahmouz() {
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (����������� ������������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (���� ��������������� )
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ���������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� �������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ��������������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
