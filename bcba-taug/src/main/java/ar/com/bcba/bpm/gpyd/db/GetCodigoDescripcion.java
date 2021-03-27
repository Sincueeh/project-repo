package ar.com.bcba.bpm.gpyd.db;


import ar.com.bcba.bpm.gpyd.models.CodigoDescripcion;
import ar.com.bcba.bpm.gpyd.models.CodigoDescripcionResult;
import ar.com.bcba.bpm.gpyd.models.GenericoCodigoDescripcion;
import ar.com.bcba.bpm.gpyd.models.GenericoCodigoDescripcionResult;
import ar.com.bcba.bpm.gpyd.utils.Select;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* maps info obtained from database as GenericoCodigoDescripcion */
public class GetCodigoDescripcion {
    private static CodigoDescripcionResult main(String sql) {
        CodigoDescripcionResult codigoDescripcionResult = new CodigoDescripcionResult();
        List<CodigoDescripcion> list = new ArrayList();
        CodigoDescripcion gen = new CodigoDescripcion();
        ResultSet rs = null;
        try{
            rs = Select.main(sql);

            if(rs.next()) {
                codigoDescripcionResult.setOk(true);
                while(rs.next()) {

                    gen.setCodigo(rs.getInt("codigo"));
                    gen.setDescripcion(rs.getString("descripcion"));

                    list.add(gen);
                }

                codigoDescripcionResult.setCodigoDescripcion(list);

            }else{
                codigoDescripcionResult.setOk(false);
            }

            rs.close();

        }catch (Exception e) {
            System.out.println("Error en GetCodigoDescripcion Java: " + e);
        }
        return codigoDescripcionResult;
    }

}
