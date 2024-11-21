# color-awt

[dev.mccue.color](https://github.com/bowbahdoe/color) support for the standard `java.desktop` based
`java.awt.Color`.

```xml 
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>color-awt</artifactId>
    <version>2024.11.20</version>
</dependency>
```

## Usage

```java 
import dev.mccue.color.Color;
import dev.mccue.color.awt.AWTColor;

import javax.swing.*;
import java.awt.*;

void main() {
    // AWTColor extends java.awt.Color
    // and implements dev.mccue.color.Color
    AWTColor c = AWTColor.of(Color.sRGB(1.0, 0.5, 0.125));

    var frame = new JFrame();

    var panel = new JPanel();
    panel.setMinimumSize(new Dimension(400, 400));
    panel.setBackground(c);
    frame.add(panel);

    frame.setMinimumSize(new Dimension(400, 400));
    frame.setResizable(false);
    frame.pack();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
```