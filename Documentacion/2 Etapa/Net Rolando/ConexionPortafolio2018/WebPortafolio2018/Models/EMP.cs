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
    
    public partial class EMP
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public EMP()
        {
            this.EMP1 = new HashSet<EMP>();
        }
    
        public short EMPNO { get; set; }
        public string ENAME { get; set; }
        public string JOB { get; set; }
        public Nullable<short> MGR { get; set; }
        public Nullable<System.DateTime> HIREDATE { get; set; }
        public Nullable<decimal> SAL { get; set; }
        public Nullable<decimal> COMM { get; set; }
        public Nullable<byte> DEPTNO { get; set; }
    
        public virtual DEPT DEPT { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<EMP> EMP1 { get; set; }
        public virtual EMP EMP2 { get; set; }
    }
}
