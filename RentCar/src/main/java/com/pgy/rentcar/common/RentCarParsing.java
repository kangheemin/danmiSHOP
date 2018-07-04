package com.pgy.rentcar.common;

import com.pgy.rentcar.dto.RentCar_Dto;

public class RentCarParsing {
	public static RentCar_Dto parsing(String target) throws Exception{
		//"0/SONATA/3/50000/4/����/sonata.jpg/����������"
		String[] tokens = target.split("/");
		RentCar_Dto car = new RentCar_Dto();
		String errormsg="";
		try {
			car.setNo(0);
			car.setName(tokens[0]);
			errormsg="ī�װ���ȣ�� 1,2,3�̾�� �Ѵ�.";
			car.setCategory(Integer.parseInt(tokens[1]));
			errormsg="�����뿩�� �κ� �����̾�� �մϴ�.";
			car.setPrice(Integer.parseInt(tokens[2]));
			errormsg="ž���ڼ� �κ� �����̾�� �մϴ�.";
			car.setUsepeople(Integer.parseInt(tokens[3]));
			car.setCompany(tokens[4]);
			car.setImg(tokens[5]);
			car.setInfo(tokens[6]);
		} catch (Exception e) {
			System.err.println(errormsg);
			e.printStackTrace();
		}
		return car;
	}

	public static void main(String[] args) throws Exception {
		String target = "SONATA/3/50000/4/����/sonata.jpg/����������";
		RentCar_Dto x = RentCarParsing.parsing(target);
		System.out.println(x);
		// �Ǵٸ� ��� ������(common tool) Parsing4Batch�� Ȱ�� 
		String[] setters = new String[] { 
				"setName", "setCategory", "setPrice", "setUsepeople", "setCompany", "setImg",
				"setInfo" };
		Parsing4Batch parser = new Parsing4Batch(RentCar_Dto.class, "/");
		RentCar_Dto y=(RentCar_Dto)parser.parsing(target, setters);
		System.out.println(y);
	}
}