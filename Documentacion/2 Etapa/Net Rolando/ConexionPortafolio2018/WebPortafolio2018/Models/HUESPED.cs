//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WebPortafolio2018.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class HUESPED
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public HUESPED()
        {
            this.RELATION_26 = new HashSet<RELATION_26>();
            this.EMPRESACLIENTE2 = new HashSet<EMPRESACLIENTE>();
        }
    
        public decimal HUESPEDID { get; set; }
        public string NOMBRE { get; set; }
        public string APELLIDO_PATERNO { get; set; }
        public string APELLIDO_MATERNO { get; set; }
        public decimal EDAD { get; set; }
        public string EMAIL { get; set; }
        public string GENERO { get; set; }
        public Nullable<decimal> NIVEL { get; set; }
        public decimal CLIENTE_RUT_EMPRESA { get; set; }
        public decimal RUT { get; set; }
        public decimal EMPCLI_EMPCLIID { get; set; }
        public decimal EMPRESACLIENTEID { get; set; }
    
        public virtual EMPRESACLIENTE EMPRESACLIENTE { get; set; }
        public virtual EMPRESACLIENTE EMPRESACLIENTE1 { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<RELATION_26> RELATION_26 { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<EMPRESACLIENTE> EMPRESACLIENTE2 { get; set; }
    }
}
