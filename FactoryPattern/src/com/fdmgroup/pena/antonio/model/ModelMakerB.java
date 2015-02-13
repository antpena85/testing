package com.fdmgroup.pena.antonio.model;

public class ModelMakerB extends ModelMaker {
	
	public ModelMakerB() {
		
	}

	public Model createModel(Trims model_trim) {
		if (model_trim.equals(Trims.BASE)) return new BaseModelB();
		else if (model_trim.equals(Trims.MIDDLE)) return new MidModelB();
		else if (model_trim.equals(Trims.TOP)) return new TopModelB();
		else return null;
	}

}
