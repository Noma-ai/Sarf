package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;

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
public class PresentVocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public PresentVocalizer() {
        substitutions.add(new SuffixSubstitution("��", "�")); // EX: (������� �������� ������ ����� ������ ������� �������� ������ ������)
        substitutions.add(new SuffixSubstitution("��", "�")); // EX: (�� ������� �������� ������ ����� ������� �������� ������ ������)
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (�� ������ ������� ����� ����� ����� ������� ������� ������ ������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ���������� ���������� ������� ������� ��������� ��������� �������� ��������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ��������� ���������� �������� �������� ���������� ���������� ��������� ���������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ��������� ���������� �������� �������� ���������� ���������� ��������� ���������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ���������� ���������� ������� ������� ��������� ��������� �������� ��������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�� ����������� ������������ ���������� ���������� ������������ ������������ ����������� �����������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ����������� ������������ ���������� ���������� ������������ ������������ ����������� �����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {
        case 21:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                return true;
            }

        case 22:
            switch (formulaNo) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                return true;
            }

        case 23:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            }

        }
        return false;
    }
}
