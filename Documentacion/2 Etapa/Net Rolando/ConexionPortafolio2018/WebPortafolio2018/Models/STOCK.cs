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
    
    public partial class STOCK
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public STOCK()
        {
            this.COMPRAS = new HashSet<COMPRAS>();
            this.MOVIMIENTOINVENTARIO = new HashSet<MOVIMIENTOINVENTARIO>();
            this.STOCKRESERVA = new HashSet<STOCKRESERVA>();
            this.PRODUCTO1 = new HashSet<PRODUCTO>();
            this.MOVIMIENTOINVENTARIO1 = new HashSet<MOVIMIENTOINVENTARIO>();
        }
    
        public decimal ID { get; set; }
        public string PRODUCTOINVENTARIO { get; set; }
        public System.DateTime FECHARECEPCION { get; set; }
        public System.DateTime FECHAVENCIMIENTO { get; set; }
        public decimal CANTIDAD { get; set; }
        public decimal RUTPROVEEDOR { get; set; }
        public decimal PRODUCTOID { get; set; }
        public decimal PRODUCTO_PRODUCTOID { get; set; }
        public Nullable<decimal> STOCKCRITICO { get; set; }
        public decimal HOSTALID { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<COMPRAS> COMPRAS { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<MOVIMIENTOINVENTARIO> MOVIMIENTOINVENTARIO { get; set; }
        public virtual PRODUCTO PRODUCTO { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<STOCKRESERVA> STOCKRESERVA { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<PRODUCTO> PRODUCTO1 { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<MOVIMIENTOINVENTARIO> MOVIMIENTOINVENTARIO1 { get; set; }
    }
}