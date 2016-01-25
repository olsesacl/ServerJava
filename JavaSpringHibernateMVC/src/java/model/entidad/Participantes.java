package model.entidad;
// Generated 25-ene-2016 19:15:14 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Participantes generated by hbm2java
 */
public class Participantes  implements java.io.Serializable {


     private Integer idParticipante;
     private Integer dorsal;
     private String apellidos;
     private String nombre;
     private String sexo;
     private Date fechaNac;
     private String dni;
     private Date fechaAlta;
     private String direccion;
     private String poblacion;
     private String provincia;
     private String cp;
     private String email;
     private Integer nevento;
     private Integer numCarrera;
     private Date tiempo1;
     private Date tiempo2;
     private Date tiempo3;
     private Date tiempo4;
     private Date tiempoMeta;
     private Date seg1;
     private Date seg2;
     private Date seg3;
     private Date seg4;
     private Date seg5;
     private Date seg6;
     private String club;
     private Double numClub;
     private String telefono;
     private String grupoCate;
     private String categoria;
     private String obserInscripcion;
     private Integer posicionGeneral;
     private Integer posicionCategoria;
     private Integer posicionGrupoEdad;
     private Integer posicionClub;
     private Integer posicionClubPorSexo;
     private Integer posicionPorSexo;
     private Boolean descalificado;
     private String motivoDescalificacion;
     private Integer posSeg1;
     private Integer posSeg2;
     private Integer posSeg3;
     private Integer posSeg4;
     private Float velocidad;
     private Float velSeg1;
     private Float velSeg2;
     private Float velSeg3;
     private Float velSeg4;
     private Boolean estaFederado;
     private String codigoConchip;
     private Date fechaGrabacion;
     private String bloquearTiempo;
     private String equipo;
     private String modalitat;
     private String nlicenciaFederado;
     private Boolean retirado;
     private Boolean web;
     private String pais;

    public Participantes() {
    }

	
    public Participantes(String bloquearTiempo) {
        this.bloquearTiempo = bloquearTiempo;
    }
    public Participantes(Integer dorsal, String apellidos, String nombre, String sexo, Date fechaNac, String dni, Date fechaAlta, String direccion, String poblacion, String provincia, String cp, String email, Integer nevento, Integer numCarrera, Date tiempo1, Date tiempo2, Date tiempo3, Date tiempo4, Date tiempoMeta, Date seg1, Date seg2, Date seg3, Date seg4, Date seg5, Date seg6, String club, Double numClub, String telefono, String grupoCate, String categoria, String obserInscripcion, Integer posicionGeneral, Integer posicionCategoria, Integer posicionGrupoEdad, Integer posicionClub, Integer posicionClubPorSexo, Integer posicionPorSexo, Boolean descalificado, String motivoDescalificacion, Integer posSeg1, Integer posSeg2, Integer posSeg3, Integer posSeg4, Float velocidad, Float velSeg1, Float velSeg2, Float velSeg3, Float velSeg4, Boolean estaFederado, String codigoConchip, Date fechaGrabacion, String bloquearTiempo, String equipo, String modalitat, String nlicenciaFederado, Boolean retirado, Boolean web, String pais) {
       this.dorsal = dorsal;
       this.apellidos = apellidos;
       this.nombre = nombre;
       this.sexo = sexo;
       this.fechaNac = fechaNac;
       this.dni = dni;
       this.fechaAlta = fechaAlta;
       this.direccion = direccion;
       this.poblacion = poblacion;
       this.provincia = provincia;
       this.cp = cp;
       this.email = email;
       this.nevento = nevento;
       this.numCarrera = numCarrera;
       this.tiempo1 = tiempo1;
       this.tiempo2 = tiempo2;
       this.tiempo3 = tiempo3;
       this.tiempo4 = tiempo4;
       this.tiempoMeta = tiempoMeta;
       this.seg1 = seg1;
       this.seg2 = seg2;
       this.seg3 = seg3;
       this.seg4 = seg4;
       this.seg5 = seg5;
       this.seg6 = seg6;
       this.club = club;
       this.numClub = numClub;
       this.telefono = telefono;
       this.grupoCate = grupoCate;
       this.categoria = categoria;
       this.obserInscripcion = obserInscripcion;
       this.posicionGeneral = posicionGeneral;
       this.posicionCategoria = posicionCategoria;
       this.posicionGrupoEdad = posicionGrupoEdad;
       this.posicionClub = posicionClub;
       this.posicionClubPorSexo = posicionClubPorSexo;
       this.posicionPorSexo = posicionPorSexo;
       this.descalificado = descalificado;
       this.motivoDescalificacion = motivoDescalificacion;
       this.posSeg1 = posSeg1;
       this.posSeg2 = posSeg2;
       this.posSeg3 = posSeg3;
       this.posSeg4 = posSeg4;
       this.velocidad = velocidad;
       this.velSeg1 = velSeg1;
       this.velSeg2 = velSeg2;
       this.velSeg3 = velSeg3;
       this.velSeg4 = velSeg4;
       this.estaFederado = estaFederado;
       this.codigoConchip = codigoConchip;
       this.fechaGrabacion = fechaGrabacion;
       this.bloquearTiempo = bloquearTiempo;
       this.equipo = equipo;
       this.modalitat = modalitat;
       this.nlicenciaFederado = nlicenciaFederado;
       this.retirado = retirado;
       this.web = web;
       this.pais = pais;
    }
   
    public Integer getIdParticipante() {
        return this.idParticipante;
    }
    
    public void setIdParticipante(Integer idParticipante) {
        this.idParticipante = idParticipante;
    }
    public Integer getDorsal() {
        return this.dorsal;
    }
    
    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getNevento() {
        return this.nevento;
    }
    
    public void setNevento(Integer nevento) {
        this.nevento = nevento;
    }
    public Integer getNumCarrera() {
        return this.numCarrera;
    }
    
    public void setNumCarrera(Integer numCarrera) {
        this.numCarrera = numCarrera;
    }
    public Date getTiempo1() {
        return this.tiempo1;
    }
    
    public void setTiempo1(Date tiempo1) {
        this.tiempo1 = tiempo1;
    }
    public Date getTiempo2() {
        return this.tiempo2;
    }
    
    public void setTiempo2(Date tiempo2) {
        this.tiempo2 = tiempo2;
    }
    public Date getTiempo3() {
        return this.tiempo3;
    }
    
    public void setTiempo3(Date tiempo3) {
        this.tiempo3 = tiempo3;
    }
    public Date getTiempo4() {
        return this.tiempo4;
    }
    
    public void setTiempo4(Date tiempo4) {
        this.tiempo4 = tiempo4;
    }
    public Date getTiempoMeta() {
        return this.tiempoMeta;
    }
    
    public void setTiempoMeta(Date tiempoMeta) {
        this.tiempoMeta = tiempoMeta;
    }
    public Date getSeg1() {
        return this.seg1;
    }
    
    public void setSeg1(Date seg1) {
        this.seg1 = seg1;
    }
    public Date getSeg2() {
        return this.seg2;
    }
    
    public void setSeg2(Date seg2) {
        this.seg2 = seg2;
    }
    public Date getSeg3() {
        return this.seg3;
    }
    
    public void setSeg3(Date seg3) {
        this.seg3 = seg3;
    }
    public Date getSeg4() {
        return this.seg4;
    }
    
    public void setSeg4(Date seg4) {
        this.seg4 = seg4;
    }
    public Date getSeg5() {
        return this.seg5;
    }
    
    public void setSeg5(Date seg5) {
        this.seg5 = seg5;
    }
    public Date getSeg6() {
        return this.seg6;
    }
    
    public void setSeg6(Date seg6) {
        this.seg6 = seg6;
    }
    public String getClub() {
        return this.club;
    }
    
    public void setClub(String club) {
        this.club = club;
    }
    public Double getNumClub() {
        return this.numClub;
    }
    
    public void setNumClub(Double numClub) {
        this.numClub = numClub;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getGrupoCate() {
        return this.grupoCate;
    }
    
    public void setGrupoCate(String grupoCate) {
        this.grupoCate = grupoCate;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getObserInscripcion() {
        return this.obserInscripcion;
    }
    
    public void setObserInscripcion(String obserInscripcion) {
        this.obserInscripcion = obserInscripcion;
    }
    public Integer getPosicionGeneral() {
        return this.posicionGeneral;
    }
    
    public void setPosicionGeneral(Integer posicionGeneral) {
        this.posicionGeneral = posicionGeneral;
    }
    public Integer getPosicionCategoria() {
        return this.posicionCategoria;
    }
    
    public void setPosicionCategoria(Integer posicionCategoria) {
        this.posicionCategoria = posicionCategoria;
    }
    public Integer getPosicionGrupoEdad() {
        return this.posicionGrupoEdad;
    }
    
    public void setPosicionGrupoEdad(Integer posicionGrupoEdad) {
        this.posicionGrupoEdad = posicionGrupoEdad;
    }
    public Integer getPosicionClub() {
        return this.posicionClub;
    }
    
    public void setPosicionClub(Integer posicionClub) {
        this.posicionClub = posicionClub;
    }
    public Integer getPosicionClubPorSexo() {
        return this.posicionClubPorSexo;
    }
    
    public void setPosicionClubPorSexo(Integer posicionClubPorSexo) {
        this.posicionClubPorSexo = posicionClubPorSexo;
    }
    public Integer getPosicionPorSexo() {
        return this.posicionPorSexo;
    }
    
    public void setPosicionPorSexo(Integer posicionPorSexo) {
        this.posicionPorSexo = posicionPorSexo;
    }
    public Boolean getDescalificado() {
        return this.descalificado;
    }
    
    public void setDescalificado(Boolean descalificado) {
        this.descalificado = descalificado;
    }
    public String getMotivoDescalificacion() {
        return this.motivoDescalificacion;
    }
    
    public void setMotivoDescalificacion(String motivoDescalificacion) {
        this.motivoDescalificacion = motivoDescalificacion;
    }
    public Integer getPosSeg1() {
        return this.posSeg1;
    }
    
    public void setPosSeg1(Integer posSeg1) {
        this.posSeg1 = posSeg1;
    }
    public Integer getPosSeg2() {
        return this.posSeg2;
    }
    
    public void setPosSeg2(Integer posSeg2) {
        this.posSeg2 = posSeg2;
    }
    public Integer getPosSeg3() {
        return this.posSeg3;
    }
    
    public void setPosSeg3(Integer posSeg3) {
        this.posSeg3 = posSeg3;
    }
    public Integer getPosSeg4() {
        return this.posSeg4;
    }
    
    public void setPosSeg4(Integer posSeg4) {
        this.posSeg4 = posSeg4;
    }
    public Float getVelocidad() {
        return this.velocidad;
    }
    
    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }
    public Float getVelSeg1() {
        return this.velSeg1;
    }
    
    public void setVelSeg1(Float velSeg1) {
        this.velSeg1 = velSeg1;
    }
    public Float getVelSeg2() {
        return this.velSeg2;
    }
    
    public void setVelSeg2(Float velSeg2) {
        this.velSeg2 = velSeg2;
    }
    public Float getVelSeg3() {
        return this.velSeg3;
    }
    
    public void setVelSeg3(Float velSeg3) {
        this.velSeg3 = velSeg3;
    }
    public Float getVelSeg4() {
        return this.velSeg4;
    }
    
    public void setVelSeg4(Float velSeg4) {
        this.velSeg4 = velSeg4;
    }
    public Boolean getEstaFederado() {
        return this.estaFederado;
    }
    
    public void setEstaFederado(Boolean estaFederado) {
        this.estaFederado = estaFederado;
    }
    public String getCodigoConchip() {
        return this.codigoConchip;
    }
    
    public void setCodigoConchip(String codigoConchip) {
        this.codigoConchip = codigoConchip;
    }
    public Date getFechaGrabacion() {
        return this.fechaGrabacion;
    }
    
    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }
    public String getBloquearTiempo() {
        return this.bloquearTiempo;
    }
    
    public void setBloquearTiempo(String bloquearTiempo) {
        this.bloquearTiempo = bloquearTiempo;
    }
    public String getEquipo() {
        return this.equipo;
    }
    
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public String getModalitat() {
        return this.modalitat;
    }
    
    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }
    public String getNlicenciaFederado() {
        return this.nlicenciaFederado;
    }
    
    public void setNlicenciaFederado(String nlicenciaFederado) {
        this.nlicenciaFederado = nlicenciaFederado;
    }
    public Boolean getRetirado() {
        return this.retirado;
    }
    
    public void setRetirado(Boolean retirado) {
        this.retirado = retirado;
    }
    public Boolean getWeb() {
        return this.web;
    }
    
    public void setWeb(Boolean web) {
        this.web = web;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }




}


