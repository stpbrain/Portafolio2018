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
    
    public partial class DEMO_ORDERS
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public DEMO_ORDERS()
        {
            this.DEMO_ORDER_ITEMS = new HashSet<DEMO_ORDER_ITEMS>();
        }
    
        public decimal ORDER_ID { get; set; }
        public decimal CUSTOMER_ID { get; set; }
        public Nullable<decimal> ORDER_TOTAL { get; set; }
        public Nullable<System.DateTime> ORDER_TIMESTAMP { get; set; }
        public Nullable<decimal> USER_ID { get; set; }
    
        public virtual DEMO_CUSTOMERS DEMO_CUSTOMERS { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<DEMO_ORDER_ITEMS> DEMO_ORDER_ITEMS { get; set; }
        public virtual DEMO_USERS DEMO_USERS { get; set; }
    }
}