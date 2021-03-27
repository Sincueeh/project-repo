package ar.com.bcba.bpm.gpyd.db;


import ar.com.bcba.bpm.gpyd.models.GenericoCodigoDescripcion;
import ar.com.bcba.bpm.gpyd.models.GenericoCodigoDescripcionResult;
import ar.com.bcba.bpm.gpyd.utils.Select;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* maps info obtained from database as GenericoCodigoDescripcion */
public class GetGenericoCodigoDescripcion {
    private static GenericoCodigoDescripcionResult main(String sql) {
        GenericoCodigoDescripcionResult genericoCodigoDescripcionResult = new GenericoCodigoDescripcionResult();
        List<GenericoCodigoDescripcion> list = new ArrayList();
        GenericoCodigoDescripcion gen = new GenericoCodigoDescripcion();
        ResultSet rs = null;
        try{
            rs = Select.main(sql);

            if(rs.next()) {
                genericoCodigoDescripcionResult.setOk(true);
                while(rs.next()) {

                    gen.setCodigo(rs.getInt("codigo"));
                    gen.setCodigoAdintar(rs.getString("codigoAdintar"));
                    gen.setCodigoCobis(rs.getString("codigoCobis"));
                    gen.setCodigoNexos(rs.getString("codigoNexos"));
                    gen.setCodigoScacs(rs.getString("codigoScacs"));
                    gen.setDescripcion(rs.getString("descripcion"));

                    list.add(gen);
                }

                genericoCodigoDescripcionResult.setGenericoCodigoDescripcion(list);

            }else{
                genericoCodigoDescripcionResult.setOk(false);
            }

            rs.close();

        }catch (Exception e) {
            System.out.println("Error en GetGenericoCodigoDescripcion Java: " + e);
        }
        return genericoCodigoDescripcionResult;
    }

}
