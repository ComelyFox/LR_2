package com.Plan;

// ����� ������, ���������� �������� � ��������
public class Abilities implements IKSA {
	private String name;
	private String description;
	
	// ����������� ��� ����������
	public Abilities() {}
	
	// ����������� � �����������
	public Abilities(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// ����� ���������� �� �������
	@Override
	public void showKSA() {
		System.out.println(name);
		System.out.println(description);
	}

	// �����, ������������ ��������
	@Override
	public String getDescription() {
		return description;
	}
}
