using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using WebPortafolio2018.Models;

namespace WebPortafolio2018.Controllers
{
    public class EMPRESACLIENTEController : Controller
    {
        private Entities db = new Entities();

        // GET: EMPRESACLIENTE
        public ActionResult Index()
        {
            return View(db.EMPRESACLIENTE.ToList());
        }

        // GET: EMPRESACLIENTE/Details/5
        public ActionResult Details(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            EMPRESACLIENTE eMPRESACLIENTE = db.EMPRESACLIENTE.Find(id);
            if (eMPRESACLIENTE == null)
            {
                return HttpNotFound();
            }
            return View(eMPRESACLIENTE);
        }

        // GET: EMPRESACLIENTE/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: EMPRESACLIENTE/Create
        // Para protegerse de ataques de publicación excesiva, habilite las propiedades específicas a las que desea enlazarse. Para obtener 
        // más información vea http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "EMPRESACLIENTEID,RUTEMPRESA,NOMBREEMPRESA,CONTRASEÑA,DIRECCION,TELEFONO,EMAIL")] EMPRESACLIENTE eMPRESACLIENTE)
        {
            if (ModelState.IsValid)
            {
                db.EMPRESACLIENTE.Add(eMPRESACLIENTE);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(eMPRESACLIENTE);
        }

        // GET: EMPRESACLIENTE/Edit/5
        public ActionResult Edit(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            EMPRESACLIENTE eMPRESACLIENTE = db.EMPRESACLIENTE.Find(id);
            if (eMPRESACLIENTE == null)
            {
                return HttpNotFound();
            }
            return View(eMPRESACLIENTE);
        }

        // POST: EMPRESACLIENTE/Edit/5
        // Para protegerse de ataques de publicación excesiva, habilite las propiedades específicas a las que desea enlazarse. Para obtener 
        // más información vea http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "EMPRESACLIENTEID,RUTEMPRESA,NOMBREEMPRESA,CONTRASEÑA,DIRECCION,TELEFONO,EMAIL")] EMPRESACLIENTE eMPRESACLIENTE)
        {
            if (ModelState.IsValid)
            {
                db.Entry(eMPRESACLIENTE).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(eMPRESACLIENTE);
        }

        // GET: EMPRESACLIENTE/Delete/5
        public ActionResult Delete(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            EMPRESACLIENTE eMPRESACLIENTE = db.EMPRESACLIENTE.Find(id);
            if (eMPRESACLIENTE == null)
            {
                return HttpNotFound();
            }
            return View(eMPRESACLIENTE);
        }

        // POST: EMPRESACLIENTE/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(decimal id)
        {
            EMPRESACLIENTE eMPRESACLIENTE = db.EMPRESACLIENTE.Find(id);
            db.EMPRESACLIENTE.Remove(eMPRESACLIENTE);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
