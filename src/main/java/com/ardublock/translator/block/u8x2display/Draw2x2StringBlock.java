package com.ardublock.translator.block.u8x2display;

import com.ardublock.translator.Translator;

public class Draw2x2StringBlock extends DrawStringBlock
{
	public Draw2x2StringBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	protected String getCommand()
	{
		return "draw2x2String";
	}
}
