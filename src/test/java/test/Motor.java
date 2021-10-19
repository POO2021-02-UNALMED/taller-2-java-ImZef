package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int nuevoRegistro) {
		this.registro = nuevoRegistro;
	}
	void asignarTipo(String Tipo) {
		if (Tipo == "electrico") {
			this.tipo = Tipo;
		}
		if (Tipo == "gasolina") {
			this.tipo = Tipo;
		}
	}
}
