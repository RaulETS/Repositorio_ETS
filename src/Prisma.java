import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
/*comentario extra para github*/
/**
 * Clase que representa un prisma de base triangular (triángulo equilátero)
 * y permite calcular diversas propiedades geométricas.
 */
public class Prisma {
    private int baseTriangulo;
    private int alturaPrisma;

    /**
     * Constructor que crea un prisma con las dimensiones especificadas.
     * @param baseTriangulo Longitud de la base del triángulo equilátero.
     * @param alturaPrisma Altura del prisma.
     */
    public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    // Getters y setters
    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Calcula la altura del triángulo equilátero de la base.
     * @return Altura del triángulo equilátero.
     */
    public float alturaTriangulo() {
        return (float) (baseTriangulo * Math.sqrt(3) / 2);
    }

    /**
     * Calcula el área de la base triangular del prisma.
     * @return Área de la base triangular.
     */
    public float areaBase() {
        return (baseTriangulo * alturaTriangulo()) / 2;
    }

    /**
     * Calcula el perímetro de la base triangular.
     * @return Perímetro del triángulo equilátero.
     */
    public float perimetro() {
        return 3 * baseTriangulo;
    }

    /**
     * Calcula el área lateral del prisma.
     * @return Área lateral del prisma.
     */
    public float areaLateral() {
        return perimetro() * alturaPrisma;
    }

    /**
     * Calcula el área total del prisma (área lateral + 2 * área base).
     * @return Área total del prisma.
     */
    public float areaTotal() {
        return areaLateral() + 2 * areaBase();
    }

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("CREACION DE OBJETOS PRISMA:");
        System.out.println("==============================");

        Random random = new Random();


        Prisma[] prismas = new Prisma[3];
        for (int i = 0; i < prismas.length; i++) {
            int base = random.nextInt(10) + 1;
            int altura = random.nextInt(10) + 1;
            prismas[i] = new Prisma(base, altura);

            System.out.printf("Creado el objeto Prisma%d con:\n", i+1);
            System.out.printf("- Base: %d\n", base);
            System.out.printf("- Altura: %d\n", altura);
            System.out.printf("- Area total: %.0f\n", prismas[i].areaTotal());
        }


        Arrays.sort(prismas, new Comparator<Prisma>() {
            @Override
            public int compare(Prisma p1, Prisma p2) {
                return Float.compare(p2.areaTotal(), p1.areaTotal());
            }
        });

        System.out.println("==============================");
        System.out.println("Ordenados de mayor a menor:");
        for (int i = 0; i < prismas.length; i++) {
            System.out.printf("- Prisma%d: area total %.0f\n", i+1, prismas[i].areaTotal());
        }
    }
}