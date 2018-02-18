package br.com.lecom.livro.design.patterns.templatemethod;

import java.io.IOException;
import java.util.Map;

public class GeradorPropriedadesCriptrogrado extends GeradorArquivo {

	private int delay;

	public GeradorPropriedadesCriptrogrado(int delay) {
		this.delay = delay;
	}

	@Override
	protected byte[] processar(byte[] bytes) throws IOException {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
		}
		return newBytes;
	}

	@Override
	protected String gerarConteudo(Map<String, Object> props) {
		StringBuffer propFileBuilder = new StringBuffer();
		for (String prop : props.keySet()) {
			propFileBuilder.append(prop + "=" + props.get(prop) + "\n");
		}
		return propFileBuilder.toString();
	}

}
