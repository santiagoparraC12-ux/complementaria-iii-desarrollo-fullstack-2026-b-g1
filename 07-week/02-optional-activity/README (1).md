# Actividad Semana 7 - Entity y Repository (JPA)

## Caso: UrbanStyle E-Commerce

Este ejercicio modela el catálogo de productos de **UrbanStyle**, una tienda
de ropa urbana (camisetas, zapatos, vestidos y accesorios). Se define la
entity `Producto`, que representaría la tabla `productos` en la base de
datos, y su respectivo repository para acceder a esos datos.

## Archivos

- **Producto.java**: entity que mapea la tabla `productos`, con los
  atributos id, titulo, categoria, marca, precio, imagenUrl y stock.
- **ProductoRepository.java**: interfaz que extiende `JpaRepository` y
  agrega la consulta por método `findByCategoria`, para traer solo los
  productos de una categoría específica (por ejemplo, "zapatos").

## Operaciones CRUD

- **Create**: se usaría cuando el administrador de la tienda agrega un
  producto nuevo al catálogo (por ejemplo, una nueva camiseta de una
  colección). Se llamaría al método heredado `save(producto)`.

- **Read**: se usa para mostrar el catálogo en el frontend. `findAll()`
  trae todos los productos (para la vista de inicio), y
  `findByCategoria("zapatos")` trae solo los de una categoría, que es
  justo lo que necesita el filtro por categorías del sitio.

- **Update**: se usaría cuando cambia el precio de un producto (por
  ejemplo, en una promoción) o cuando baja el stock después de una
  venta. Se trae el producto con `findById(id)`, se modifica con los
  setters (`setPrecio`, `setStock`) y se guarda de nuevo con `save()`.

- **Delete**: se usaría cuando un producto se descontinúa y ya no debe
  aparecer en la tienda. Se llamaría a `deleteById(id)`.