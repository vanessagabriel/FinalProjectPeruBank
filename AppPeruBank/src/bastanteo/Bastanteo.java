package bastanteo;


public class Bastanteo {
	
	private String codigoGrupoBastanteo;
	private String desBastanteo;
	private String codPoder;
	private String tipoIntervencion;
	private String fecha;
	private double importe;
	private String codigoUsuario;

	public Bastanteo(String codigoGrupoBastanteo, String desBastanteo, String codPoder,
			String tipoIntervencion, String fecha, double importe,String codigoUsuario) {
		super(); 
		this.codigoGrupoBastanteo = codigoGrupoBastanteo;
		this.desBastanteo = desBastanteo;
		this.codPoder = codPoder;
		this.tipoIntervencion = tipoIntervencion;
		this.fecha = fecha;
		this.importe = importe;	
		this.codigoUsuario = codigoUsuario;		
	}
	
	
	public String getCodigoGrupoBastanteo() {
		return codigoGrupoBastanteo;
	}

	public void setCodigoGrupoBastanteo(String codigoGrupoBastanteo) {
		this.codigoGrupoBastanteo = codigoGrupoBastanteo;
	}

	public String getDesBastanteo() {
		return desBastanteo;
	}

	public void setDesBastanteo(String desBastanteo) {
		this.desBastanteo = desBastanteo;
	}

	public String getCodPoder() {
		return codPoder;
	}

	public void setCodPoder(String codPoder) {
		this.codPoder = codPoder;
	}

	public String getTipoIntervencion() {
		return tipoIntervencion;
	}

	public void setTipoIntervencion(String tipoIntervencion) {
		this.tipoIntervencion = tipoIntervencion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	

}
