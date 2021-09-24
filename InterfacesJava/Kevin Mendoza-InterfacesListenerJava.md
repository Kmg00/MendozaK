***INTERFACES LISTENER Y SUS MÉTODOS EN JAVA***
____________________________

1. `MouseListener:` Permitirá escuchar los eventos de tipo MouseEvent , que son los producidos por el ratón al interaccionar con cualquiera de las clases 

 **Métodos:**

* `MouseClicked(MouseEvent)`

* `mouseEntered(MouseEvent)`

* `mouseExited(MouseEvent)`

* `mousePressed(MouseEvent)`

* `mouseReleased(MouseEvent)`
______________________________

2. `ContainerListener:` Estos eventos son para la notificación solamente no escucha envase necesita estar presente para los componentes que se agregan o se quitan con éxito. 

**Métodos:**

* `componentAdded(ComponentEvent)`

* `componentRemoved(ComponentEvent)`
________________


3. `ActionListener:` Se usa para detectar y manejar eventos de acción. 

**Métodos:**
* `actionPerformed (ActionEvent)`
_____________________

4. `AdjustmentListener:` Para escuchar los eventos de tipo AdjustmentEvent producidos por la clase JScrollbar deberemos implementar la interfaz. 

**Métodos:**

* `adjustmentValueChanged(AdjustmentEvent)`
____________

5. `ItemListener:`

**Métodos:**
* `itemStateChanged(ItemEvent)`

_________________

6. `ComponentListener:` Para marcar un objeto con la capacidad de escuchar eventos de tipo Component Event deberemos implementar la interfaz Component Listener. 

**Métodos:**
* `componentHidden(ComponentEvent)`
* `componentMoved(ComponentEvent)`
* `componentResized(ComponentEvent)`
* `componentShown(ComponentEvent)`
____

7. `FocusListener` Cuando un componente recibe el foco, es decir, es el elemento de la pantalla que está activo se producen eventos de tipo FocusEvent. 

**Métodos:**
* `focusGained(FocusEvent)`
* `focusLost(FocusEvent)`
___

8. `KeyListener:` Se puede detectar y tratar los eventos generados por la pulsación de una tecla o por combinaciones de ellas. 

**Métodos:**
* `keyPressed(KeyEvent)`
* `keyReleased(KeyEvent)`
* `keyTyped(KeyEvent)`
___
\\By Kevin Mendoza

\\18100796
