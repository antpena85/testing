package com.fdmgroup.pena.antonio.model;

public class ModelMakerA extends ModelMaker {

	@Override
	public Model createModel(Trims model_trim) {
		System.out.println(model_trim);
		if (model_trim.equals(Trims.BASE)) return new BaseModelA();
		else if (model_trim.equals(Trims.MIDDLE)) return new MidModelA();
		else if (model_trim.equals(Trims.TOP)) return new TopModelA();
		else return null;
	}

}
