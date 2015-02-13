package com.fdmgroup.pena.antonio.model;

public class Test 
{
	public static void main(String[] args) {
		ModelMaker modelb = new ModelMakerB();
		ModelMaker modela = new ModelMakerA();
			
		Model model = modela.orderModel(Trims.BASE);
		System.out.println("John's "+model.getModel_name()+" is ready for pick up!\n");
//		model = modelb.orderModel("middle");
//		System.out.println("Steward's  "+model.getModel_name()+" is ready for pick up!\n");
//		model = modelb.orderModel("top");
//		System.out.println("Miley's  "+model.getModel_name()+" is ready for pick up!\n");
		
//		model = modela.orderModel("base");
//		System.out.println("Max's "+model.getModel_name()+" is ready for pick up!\n");
//		model = modela.orderModel("middle");
//		System.out.println("Jenny's  "+model.getModel_name()+" is ready for pick up!\n");
		model = modelb.orderModel(Trims.TOP);
		System.out.println("Keith's  "+model.getModel_name()+" is ready for pick up!\n");
		
		
	}
}
