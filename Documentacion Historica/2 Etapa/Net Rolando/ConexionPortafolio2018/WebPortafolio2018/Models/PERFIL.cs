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
    
    public partial class PERFIL
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public PERFIL()
        {
            this.EMPLEADO1 = new HashSet<EMPLEADO>();
            this.FUNCIONARIO1 = new HashSet<FUNCIONARIO>();
        }
    
        public decimal PERFILID { get; set; }
        public Nullable<byte> ADMINISTRADOR { get; set; }
        public Nullable<byte> CLIENTE { get; set; }
        public Nullable<byte> EMPLEADO { get; set; }
        public Nullable<byte> PROVEEDOR { get; set; }
        public string DESCRIPCION { get; set; }
        public decimal FUNCIONARIO_FUNCIONARIOID { get; set; }
        public decimal ACCESO { get; set; }
    
        public virtual FUNCIONARIO FUNCIONARIO { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<EMPLEADO> EMPLEADO1 { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<FUNCIONARIO> FUNCIONARIO1 { get; set; }
    }
}