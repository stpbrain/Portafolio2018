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
    
    public partial class APEX__WS_WEBPG_SECTIONS
    {
        public decimal ID { get; set; }
        public decimal WS_APP_ID { get; set; }
        public Nullable<decimal> WEBPAGE_ID { get; set; }
        public Nullable<decimal> DISPLAY_SEQUENCE { get; set; }
        public string SECTION_TYPE { get; set; }
        public string TITLE { get; set; }
        public string CONTENT { get; set; }
        public string CONTENT_UPPER { get; set; }
        public Nullable<decimal> NAV_START_WEBPAGE_ID { get; set; }
        public Nullable<decimal> NAV_MAX_LEVEL { get; set; }
        public string NAV_INCLUDE_LINK { get; set; }
        public Nullable<decimal> DATA_GRID_ID { get; set; }
        public Nullable<decimal> REPORT_ID { get; set; }
        public Nullable<decimal> DATA_SECTION_STYLE { get; set; }
        public string CHART_TYPE { get; set; }
        public string CHART_3D { get; set; }
        public string CHART_LABEL { get; set; }
        public string LABEL_AXIS_TITLE { get; set; }
        public string CHART_VALUE { get; set; }
        public string VALUE_AXIS_TITLE { get; set; }
        public string CHART_AGGREGATE { get; set; }
        public string CHART_SORTING { get; set; }
        public System.DateTime CREATED_ON { get; set; }
        public string CREATED_BY { get; set; }
        public Nullable<System.DateTime> UPDATED_ON { get; set; }
        public string UPDATED_BY { get; set; }
    }
}