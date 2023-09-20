import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VideoclipsComponent } from './videoclips.component';

describe('VideoclipsComponent', () => {
  let component: VideoclipsComponent;
  let fixture: ComponentFixture<VideoclipsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VideoclipsComponent]
    });
    fixture = TestBed.createComponent(VideoclipsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
