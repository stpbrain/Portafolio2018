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
    
    public partial class DEMO_ORDER_ITEMS
    {
        public byte ORDER_ITEM_ID { get; set; }
        public decimal ORDER_ID { get; set; }
        public decimal PRODUCT_ID { get; set; }
        public decimal UNIT_PRICE { get; set; }
        public int QUANTITY { get; set; }
    
        public virtual DEMO_ORDERS DEMO_ORDERS { get; set; }
        public virtual DEMO_PRODUCT_INFO DEMO_PRODUCT_INFO { get; set; }
    }
}