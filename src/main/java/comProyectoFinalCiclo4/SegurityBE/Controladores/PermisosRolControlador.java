package comProyectoFinalCiclo4.SegurityBE.Controladores;

import comProyectoFinalCiclo4.SegurityBE.Modelos.PermisosRol;
import comProyectoFinalCiclo4.SegurityBE.Modelos.Permiso;
import comProyectoFinalCiclo4.SegurityBE.Repositorios.PermisoRepositorio;
import comProyectoFinalCiclo4.SegurityBE.Repositorios.PermisosRolRepositorio;
import comProyectoFinalCiclo4.SegurityBE.Repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class PermisosRolControlador {

    private PermisosRolRepositorio repositorioPermisosRol;
    @Autowired
    private PermisoRepositorio repositorioPermisos;
    private RolRepositorio repositorioRol;

    @PostMapping("rol/{id_rol}/permiso/{id_permiso}")
    public PermisosRol create(@PathVariable String id_rol, @PathVariable String id_permiso)
        Permiso p = this.repositorioPermisos.finById(id_permiso).orElse(null);
        Rol r = this.repositorioRol.findById(id_rol).orElse(null);
        if(p != null && r != null){
            PermisosRol pr = new PermisosRol();
            pr.setPermiso(p);
            pr.setRol(r);
            return this.repositorioPermisosRol.save(pr);
        } else {
            return null
        }
        //1:06
    /*
    Los microservicios de listado, consulta, borrado etc se implementan de manera similar al de usuario
     */


}
