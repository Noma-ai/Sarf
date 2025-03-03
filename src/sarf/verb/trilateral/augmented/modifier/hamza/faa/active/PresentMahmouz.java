package sarf.verb.trilateral.augmented.modifier.hamza.faa.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.faa.*;

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
public class PresentMahmouz extends AbstractFaaMahmouz {

    private List substitutions = new LinkedList();

    public PresentMahmouz() {

        substitutions.add(new InfixSubstitution("����", "���")); // EX: (��� �������� )
        substitutions.add(new InfixSubstitution("����", "�")); // EX: (��� �������� )
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (���������)
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (�������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������� �����������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������������ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������������ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���������� ���������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
