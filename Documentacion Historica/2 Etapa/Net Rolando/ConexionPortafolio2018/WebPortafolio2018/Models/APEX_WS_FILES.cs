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
    
    public partial class APEX_WS_FILES
    {
        public decimal ID { get; set; }
        public decimal WS_APP_ID { get; set; }
        public Nullable<decimal> DATA_GRID_ID { get; set; }
        public Nullable<decimal> ROW_ID { get; set; }
        public Nullable<decimal> WEBPAGE_ID { get; set; }
        public string COMPONENT_LEVEL { get; set; }
        public string NAME { get; set; }
        public string IMAGE_ALIAS { get; set; }
        public string IMAGE_ATTRIBUTES { get; set; }
        public byte[] CONTENT { get; set; }
        public Nullable<System.DateTime> CONTENT_LAST_UPDATE { get; set; }
        public string MIME_TYPE { get; set; }
        public string CONTENT_CHARSET { get; set; }
        public string CONTENT_FILENAME { get; set; }
        public string DESCRIPTION { get; set; }
        public System.DateTime CREATED_ON { get; set; }
        public string CREATED_BY { get; set; }
        public Nullable<System.DateTime> UPDATED_ON { get; set; }
        public string UPDATED_BY { get; set; }
    
        public virtual APEX__WS_ROWS APEX__WS_ROWS { get; set; }
    }
}