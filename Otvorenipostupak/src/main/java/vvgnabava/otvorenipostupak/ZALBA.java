package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ZALBA")
@org.kie.api.definition.type.Description("Evidencija pristiglih zalbi")
public class ZALBA implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id_zalba")
   private java.lang.Integer id_zalba;
   @org.kie.api.definition.type.Label(value = "predmet_zalba")
   private vvgnabava.otvorenipostupak.ZALBA predmet_zalba;
   @org.kie.api.definition.type.Label(value = "datum_zalbe")
   private java.util.Date datum_zalbe;

   public ZALBA()
   {
   }

   public java.lang.Integer getId_zalba()
   {
      return this.id_zalba;
   }

   public void setId_zalba(java.lang.Integer id_zalba)
   {
      this.id_zalba = id_zalba;
   }

   public vvgnabava.otvorenipostupak.ZALBA getPredmet_zalba()
   {
      return this.predmet_zalba;
   }

   public void setPredmet_zalba(vvgnabava.otvorenipostupak.ZALBA predmet_zalba)
   {
      this.predmet_zalba = predmet_zalba;
   }

   public java.util.Date getDatum_zalbe()
   {
      return this.datum_zalbe;
   }

   public void setDatum_zalbe(java.util.Date datum_zalbe)
   {
      this.datum_zalbe = datum_zalbe;
   }

   public ZALBA(java.lang.Integer id_zalba,
         vvgnabava.otvorenipostupak.ZALBA predmet_zalba,
         java.util.Date datum_zalbe)
   {
      this.id_zalba = id_zalba;
      this.predmet_zalba = predmet_zalba;
      this.datum_zalbe = datum_zalbe;
   }

}