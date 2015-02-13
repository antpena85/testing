package com.fdmgroup.pena.antonio.model;

public abstract class ModelMaker {
	
	Trims model_trim;
	
		 
	public abstract Model createModel(Trims model_trim);
	
	public  Model orderModel(Trims trim)
	{
		Model model = createModel(trim);
		System.out.println("---Building a "+model.getModel_name() +"----");
		
		model.build();		
		return model;
	}
	
}
