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
    
    public partial class MOVIMIENTOINVENTARIO
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public MOVIMIENTOINVENTARIO()
        {
            this.STOCK1 = new HashSet<STOCK>();
        }
    
        public decimal MOVIMIENTOINVENTARIOID { get; set; }
        public string PRODUCTO { get; set; }
        public decimal CANTIDAD { get; set; }
        public decimal INVENTARIOID { get; set; }
        public string OBSERVACION { get; set; }
        public decimal INVENTARIO_INVENTARIOID { get; set; }
    
        public virtual STOCK STOCK { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<STOCK> STOCK1 { get; set; }
    }
}
